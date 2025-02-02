// Copyright (c) 2011, the Dart project authors.  Please see the AUTHORS file
// for details. All rights reserved. Use of this source code is governed by a
// BSD-style license that can be found in the LICENSE file.

package org.jetbrains.kotlin.js.backend.ast;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.js.util.AstUtil;
import org.jetbrains.annotations.NotNull;
import com.intellij.util.SmartList;

import java.util.List;

/**
 * Represents a JavaScript block statement.
 */
public class JsBlock extends SourceInfoAwareJsNode implements JsStatement {
    @NotNull
    private final List<JsStatement> statements;

    @Nullable
    private JsLocationWithSource closingBraceSource;

    public JsBlock() {
        this(new SmartList<JsStatement>());
    }

    public JsBlock(JsStatement statement) {
        this(new SmartList<JsStatement>(statement));
    }

    public JsBlock(JsStatement... statements) {
        this(new SmartList<JsStatement>(statements));
    }

    public JsBlock(@NotNull List<JsStatement> statements) {
        this.statements = statements;
    }

    @NotNull
    public List<JsStatement> getStatements() {
        return statements;
    }

    @Nullable
    public JsLocationWithSource getClosingBraceSource() {
        return closingBraceSource;
    }

    public void setClosingBraceSource(@Nullable JsLocationWithSource closingBraceLocation) {
        this.closingBraceSource = closingBraceLocation;
    }

    public boolean isEmpty() {
        return statements.isEmpty();
    }

    public boolean isTransparent() {
        return false;
    }

    @Override
    public void accept(JsVisitor v) {
        v.visitBlock(this);
    }

    @Override
    public void acceptChildren(JsVisitor visitor) {
        visitor.acceptWithInsertRemove(statements);
    }

    @Override
    public void traverse(JsVisitorWithContext v, JsContext ctx) {
        if (v.visit(this, ctx)) {
            v.acceptStatementList(statements);
        }
        v.endVisit(this, ctx);
    }

    @NotNull
    @Override
    public JsBlock deepCopy() {
        JsBlock block = new JsBlock(AstUtil.deepCopy(statements)).withMetadataFrom(this);
        block.setClosingBraceSource(getClosingBraceSource());
        return block;
    }
}
