/**
 * Copyright (C) 2012 WRML.org <mark@wrml.org>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wrml.util.observable;

import org.wrml.util.Cancelable;

/**
 * Fired from an ObservableList whenever its contents are altered.
 * 
 * @param <K>
 *            The key type
 * @param <V>
 *            The value type
 */
public final class CancelableMapEvent extends MapEvent implements Cancelable {

    private static final long serialVersionUID = 1L;

    private boolean _Cancelled;

    public CancelableMapEvent(ObservableMap<?, ?> map) {
        super(map);
    }

    public CancelableMapEvent(ObservableMap<?, ?> map, Object key) {
        super(map, key);
    }

    public CancelableMapEvent(ObservableMap<?, ?> map, Object key, Object newValue, Object oldValue) {
        super(map, key, newValue, oldValue);
    }

    @Override
    public boolean isCancelled() {
        return _Cancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        _Cancelled = cancelled;
    }

}