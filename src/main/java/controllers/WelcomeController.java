package controllers;

import jdk.nashorn.internal.runtime.options.Option;
import lombok.SneakyThrows;

import javax.annotation.Resource;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.util.Optional;

import static model.User.FIRST_NAME_KEY;

/**
 * Created by admin on 25.04.2017.
 */
@WebServlet("/")
public class WelcomeController extends HttpServlet {

    public static String WELCOME_KEY = "Welcome";

    @Resource(name = "jdbc/TestDB")
    private DataSource dataSource;

    @Override
    @SneakyThrows
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {
        // ofNullable - это статический метод Optional, который говорит о том, что если туда null
        // подать, то это будет Optional от null, а если будет реальный объект, то это будет Optional
        // с реальным объектом. Дальше map выполняется только если там реальный объект не null и он преобразует
        // значение в результат вызова функции. Если ничего нету, то вызывается просто Hello
        String s = Optional.ofNullable(req.getSession().getAttribute(FIRST_NAME_KEY))
            .map(o -> String.format("Hello, %s!", o))
            .orElse("Hello!");

        req.setAttribute(WELCOME_KEY, s);

//        Context initContext = new InitialContext();
//        Context envContext  = (Context)initContext.lookup("java:/comp/env");
//        DataSource ds = (DataSource)envContext.lookup("jdbc/myoracle");
//        Connection conn = ds.getConnection();



        // Добавляем имя и это имя отпрвавляем в реквесте индексовой страницы
        req.getRequestDispatcher("/WEB-INF/index.jsp")
            .forward(req, resp);


    }
}
