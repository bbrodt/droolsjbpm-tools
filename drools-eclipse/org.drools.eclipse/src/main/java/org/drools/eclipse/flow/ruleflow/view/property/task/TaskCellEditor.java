/*
 * Copyright 2005 Red Hat, Inc. and/or its affiliates.
 *
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
 */

package org.drools.eclipse.flow.ruleflow.view.property.task;

import org.drools.eclipse.flow.common.view.property.BeanDialogCellEditor;
import org.drools.eclipse.flow.common.view.property.EditBeanDialog;
import org.drools.core.process.core.Work;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

/**
 * Cell editor for an action.
 */
public class TaskCellEditor extends BeanDialogCellEditor<Work> {

    public TaskCellEditor(Composite parent) {
        super(parent);
    }

    protected EditBeanDialog<Work> createDialog(Shell shell) {
        return new TaskDialog(shell);
    }
    
}
