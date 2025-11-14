package q5;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import q4.X;
import x5.l;
import x5.m;

/* loaded from: classes.dex */
public final class b extends X {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14148e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14149f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i4, Object obj) {
        super(4);
        this.f14148e = i4;
        this.f14149f = obj;
    }

    @Override // q4.X
    public final void F(int i4) {
        switch (this.f14148e) {
            case 0:
                return;
            default:
                m mVar = (m) this.f14149f;
                mVar.f16213e = true;
                l lVar = (l) mVar.f16214f.get();
                if (lVar != null) {
                    lVar.a();
                    return;
                }
                return;
        }
    }

    @Override // q4.X
    public final void G(Typeface typeface, boolean z8) {
        CharSequence text;
        switch (this.f14148e) {
            case 0:
                Chip chip = (Chip) this.f14149f;
                f fVar = chip.f10046h;
                if (fVar.f14166G0) {
                    text = fVar.f14169I;
                } else {
                    text = chip.getText();
                }
                chip.setText(text);
                chip.requestLayout();
                chip.invalidate();
                return;
            default:
                if (!z8) {
                    m mVar = (m) this.f14149f;
                    mVar.f16213e = true;
                    l lVar = (l) mVar.f16214f.get();
                    if (lVar != null) {
                        lVar.a();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    private final void f0(int i4) {
    }
}
