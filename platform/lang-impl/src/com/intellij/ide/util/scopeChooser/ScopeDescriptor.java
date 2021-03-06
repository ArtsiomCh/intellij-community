// Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.intellij.ide.util.scopeChooser;

import com.intellij.openapi.util.Comparing;
import com.intellij.psi.search.SearchScope;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * @author anna
 */
public class ScopeDescriptor {
  private final SearchScope myScope;

  public ScopeDescriptor(@Nullable SearchScope scope) {
    myScope = scope;
  }

  public String getDisplayName() {
    return myScope == null ? null : myScope.getDisplayName();
  }

  @Nullable
  public Icon getIcon() {
    return myScope == null ? null : myScope.getIcon();
  }

  @Nullable
  public SearchScope getScope() {
    return myScope;
  }

  public boolean scopeEquals(SearchScope scope) {
    return Comparing.equal(myScope, scope);
  }
}
