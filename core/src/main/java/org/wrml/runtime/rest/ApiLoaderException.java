/**
 * WRML - Web Resource Modeling Language
 *  __     __   ______   __    __   __
 * /\ \  _ \ \ /\  == \ /\ "-./  \ /\ \
 * \ \ \/ ".\ \\ \  __< \ \ \-./\ \\ \ \____
 *  \ \__/".~\_\\ \_\ \_\\ \_\ \ \_\\ \_____\
 *   \/_/   \/_/ \/_/ /_/ \/_/  \/_/ \/_____/
 *
 * http://www.wrml.org
 *
 * Copyright (C) 2011 - 2013 Mark Masse <mark@wrml.org> (OSS project WRML.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wrml.runtime.rest;

/**
 * The {@link ApiLoader}'s associated error type.
 */
public class ApiLoaderException extends RuntimeException
{

    private final ApiLoader _ApiLoader;

    private static final long serialVersionUID = 1L;

    /**
     * Create a new exception to communicate a problem about the specified {@link ApiLoader}.
     * 
     * @param message
     *            The message to explain what is going on.
     * 
     * @param apiLoader
     *            The impacted {@link ApiLoader}.
     * 
     */
    ApiLoaderException(final String message, final Throwable cause, final ApiLoader apiLoader)
    {
        super(message, cause);
        _ApiLoader = apiLoader;
    }

    /**
     * Get the {@link ApiLoader} associated with this error.
     * 
     * @return The {@link ApiLoader} that raised this exception.
     */
    public ApiLoader getApiLoader()
    {
        return _ApiLoader;
    }

}
