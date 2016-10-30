/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2016 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package gwt.material.design.client.ui.html;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.client.base.HasWaves;
import gwt.material.design.client.base.MaterialWidget;

public class UnorderedList extends MaterialWidget {

    public UnorderedList() {
        super(Document.get().createULElement());
    }

    public UnorderedList(String... initialClass) {
        super(Document.get().createULElement(), initialClass);
    }

    @Override
    public void add(Widget child) {
        if (child instanceof ListItem) {
            add(child, (Element) getElement());
        } else {
            ListItem li = new ListItem(child);
            if (child instanceof HasWaves) {
                li.setWaves(((HasWaves) child).getWaves());
                ((HasWaves) child).setWaves(null);
            }
            add(li, (Element) getElement());
        }
    }
}
