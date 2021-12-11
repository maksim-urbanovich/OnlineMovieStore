package com.maximus.jwd.controller;

import com.maximus.jwd.controller.command.Command;
import com.maximus.jwd.controller.command.impl.RegistrationCommand;
import com.maximus.jwd.controller.util.CommandEnum;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.EnumMap;
import java.util.Map;
import java.util.logging.Logger;

import static com.maximus.jwd.controller.util.CommandEnum.*;
import static java.util.Objects.isNull;

public class FrontController extends HttpServlet {
    public static final Logger LOGGER = Logger.getLogger(FrontController.class.getName());
    private Map<CommandEnum, Command> commandMap;

    @Override
    public void init() throws ServletException {
        //super.init(config);
        initCommandMap();
    }

    private void initCommandMap() {
        if (isNull(commandMap)) {
            commandMap = new EnumMap<CommandEnum, Command>(CommandEnum.class);
        }
        commandMap.put(REGISTRATION, new RegistrationCommand());

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doExecute(req, resp);
    }

    private void doExecute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        // get CommandParam
        // find suitable enum
        // get command according to enum
        // process command
    }
}
