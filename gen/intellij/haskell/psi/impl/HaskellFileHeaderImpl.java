// This is a generated file. Not intended for manual editing.
package intellij.haskell.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import intellij.haskell.psi.HaskellFileHeader;
import intellij.haskell.psi.HaskellPragma;
import intellij.haskell.psi.HaskellVisitor;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class HaskellFileHeaderImpl extends HaskellCompositeElementImpl implements HaskellFileHeader {

    public HaskellFileHeaderImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull HaskellVisitor visitor) {
        visitor.visitFileHeader(this);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof HaskellVisitor) accept((HaskellVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public List<HaskellPragma> getPragmaList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, HaskellPragma.class);
    }

}
