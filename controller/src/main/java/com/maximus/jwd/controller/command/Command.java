package com.maximus.jwd.controller.command;

import com.maximus.jwd.controller.exception.ControllerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {
    void process(HttpServletRequest req, HttpServletResponse resp) throws ControllerException;
}
