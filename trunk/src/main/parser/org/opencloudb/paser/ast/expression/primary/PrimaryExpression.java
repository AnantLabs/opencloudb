/*
 * Copyright 2012-2015 org.opencloudb.
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
/**
 * (created at 2011-4-12)
 */
package org.opencloudb.paser.ast.expression.primary;

import java.util.Map;

import org.opencloudb.paser.ast.expression.AbstractExpression;

/**
 * @author mycat
 */
public abstract class PrimaryExpression extends AbstractExpression {
    @Override
    public int getPrecedence() {
        return PRECEDENCE_PRIMARY;
    }

    @Override
    public Object evaluationInternal(Map<? extends Object, ? extends Object> parameters) {
        return UNEVALUATABLE;
    }
}