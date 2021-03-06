// MIT License
//
// Copyright (c) 2018 Shalitha Suranga
//
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
//
// The above copyright notice and this permission notice shall be included in all
// copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
// SOFTWARE.

package org.jerverless.core.console;

import org.jerverless.core.console.commands.ConsoleCommand;
import org.jerverless.core.console.commands.HelpCommand;
import org.jerverless.core.console.commands.RestartCommand;
import org.jerverless.core.console.commands.StopCommand;
import org.jerverless.core.console.commands.UnknownCommand;

/**
 *
 * @author ShalithaS
 */
public class CommandFactory {
    
    private static ServerConsole consoleContext = null;

    public CommandFactory(ServerConsole console) {
        consoleContext = console;
    }
    
    public ConsoleCommand make(String input) {
        if(input.equals(RestartCommand.COMMAND)) {
            return new RestartCommand(consoleContext);
        }
        else if (input.equals(HelpCommand.COMMAND)) {
            return new HelpCommand(consoleContext);
        }
        else if (input.equals(StopCommand.COMMAND)) {
            return new StopCommand(consoleContext);
        }
        return new UnknownCommand(consoleContext);
    }
    
}
