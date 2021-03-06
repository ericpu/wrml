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
package org.wrml.runtime.schema;

/**
 * The {@link Prototype}'s associated error type.
 */
public class PrototypeException extends RuntimeException
{

    private static final long serialVersionUID = 1L;

    private final Prototype _Prototype;

    private final String _SlotName;

    PrototypeException(final String message, final Prototype prototype)
    {
        this(message, null, prototype, null);
    }

    PrototypeException(final String message, final Throwable cause, final Prototype prototype)
    {
        this(message, cause, prototype, null);
    }

    PrototypeException(final String message, final Throwable cause, final Prototype prototype, final String slotName)
    {
        super(message, cause);
        _Prototype = prototype;
        _SlotName = slotName;
    }

    public Prototype getPrototype()
    {
        return _Prototype;
    }

    public String getSlotName()
    {
        return _SlotName;
    }
}
