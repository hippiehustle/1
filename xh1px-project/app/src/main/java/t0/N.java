package t0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class N extends c0.g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14778d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ N(AbstractC1537c0 abstractC1537c0, int i4) {
        super(abstractC1537c0);
        this.f14778d = i4;
    }

    @Override // c0.g
    public final int d(View view) {
        int D7;
        int i4;
        switch (this.f14778d) {
            case 0:
                d0 d0Var = (d0) view.getLayoutParams();
                ((AbstractC1537c0) this.f9383b).getClass();
                D7 = AbstractC1537c0.D(view);
                i4 = ((ViewGroup.MarginLayoutParams) d0Var).rightMargin;
                break;
            default:
                d0 d0Var2 = (d0) view.getLayoutParams();
                ((AbstractC1537c0) this.f9383b).getClass();
                D7 = AbstractC1537c0.y(view);
                i4 = ((ViewGroup.MarginLayoutParams) d0Var2).bottomMargin;
                break;
        }
        return D7 + i4;
    }

    @Override // c0.g
    public final int e(View view) {
        int C8;
        int i4;
        switch (this.f14778d) {
            case 0:
                d0 d0Var = (d0) view.getLayoutParams();
                ((AbstractC1537c0) this.f9383b).getClass();
                C8 = AbstractC1537c0.C(view) + ((ViewGroup.MarginLayoutParams) d0Var).leftMargin;
                i4 = ((ViewGroup.MarginLayoutParams) d0Var).rightMargin;
                break;
            default:
                d0 d0Var2 = (d0) view.getLayoutParams();
                ((AbstractC1537c0) this.f9383b).getClass();
                C8 = AbstractC1537c0.B(view) + ((ViewGroup.MarginLayoutParams) d0Var2).topMargin;
                i4 = ((ViewGroup.MarginLayoutParams) d0Var2).bottomMargin;
                break;
        }
        return C8 + i4;
    }

    @Override // c0.g
    public final int f(View view) {
        int B8;
        int i4;
        switch (this.f14778d) {
            case 0:
                d0 d0Var = (d0) view.getLayoutParams();
                ((AbstractC1537c0) this.f9383b).getClass();
                B8 = AbstractC1537c0.B(view) + ((ViewGroup.MarginLayoutParams) d0Var).topMargin;
                i4 = ((ViewGroup.MarginLayoutParams) d0Var).bottomMargin;
                break;
            default:
                d0 d0Var2 = (d0) view.getLayoutParams();
                ((AbstractC1537c0) this.f9383b).getClass();
                B8 = AbstractC1537c0.C(view) + ((ViewGroup.MarginLayoutParams) d0Var2).leftMargin;
                i4 = ((ViewGroup.MarginLayoutParams) d0Var2).rightMargin;
                break;
        }
        return B8 + i4;
    }

    @Override // c0.g
    public final int g(View view) {
        int A2;
        int i4;
        switch (this.f14778d) {
            case 0:
                d0 d0Var = (d0) view.getLayoutParams();
                ((AbstractC1537c0) this.f9383b).getClass();
                A2 = AbstractC1537c0.A(view);
                i4 = ((ViewGroup.MarginLayoutParams) d0Var).leftMargin;
                break;
            default:
                d0 d0Var2 = (d0) view.getLayoutParams();
                ((AbstractC1537c0) this.f9383b).getClass();
                A2 = AbstractC1537c0.E(view);
                i4 = ((ViewGroup.MarginLayoutParams) d0Var2).topMargin;
                break;
        }
        return A2 - i4;
    }

    @Override // c0.g
    public final int h() {
        switch (this.f14778d) {
            case 0:
                return ((AbstractC1537c0) this.f9383b).f14821n;
            default:
                return ((AbstractC1537c0) this.f9383b).f14822o;
        }
    }

    @Override // c0.g
    public final int i() {
        int i4;
        int I8;
        switch (this.f14778d) {
            case 0:
                AbstractC1537c0 abstractC1537c0 = (AbstractC1537c0) this.f9383b;
                i4 = abstractC1537c0.f14821n;
                I8 = abstractC1537c0.I();
                break;
            default:
                AbstractC1537c0 abstractC1537c02 = (AbstractC1537c0) this.f9383b;
                i4 = abstractC1537c02.f14822o;
                I8 = abstractC1537c02.G();
                break;
        }
        return i4 - I8;
    }

    @Override // c0.g
    public final int j() {
        switch (this.f14778d) {
            case 0:
                return ((AbstractC1537c0) this.f9383b).I();
            default:
                return ((AbstractC1537c0) this.f9383b).G();
        }
    }

    @Override // c0.g
    public final int k() {
        switch (this.f14778d) {
            case 0:
                return ((AbstractC1537c0) this.f9383b).f14819l;
            default:
                return ((AbstractC1537c0) this.f9383b).f14820m;
        }
    }

    @Override // c0.g
    public final int l() {
        switch (this.f14778d) {
            case 0:
                return ((AbstractC1537c0) this.f9383b).f14820m;
            default:
                return ((AbstractC1537c0) this.f9383b).f14819l;
        }
    }

    @Override // c0.g
    public final int m() {
        switch (this.f14778d) {
            case 0:
                return ((AbstractC1537c0) this.f9383b).H();
            default:
                return ((AbstractC1537c0) this.f9383b).J();
        }
    }

    @Override // c0.g
    public final int n() {
        int H2;
        int I8;
        switch (this.f14778d) {
            case 0:
                AbstractC1537c0 abstractC1537c0 = (AbstractC1537c0) this.f9383b;
                H2 = abstractC1537c0.f14821n - abstractC1537c0.H();
                I8 = abstractC1537c0.I();
                break;
            default:
                AbstractC1537c0 abstractC1537c02 = (AbstractC1537c0) this.f9383b;
                H2 = abstractC1537c02.f14822o - abstractC1537c02.J();
                I8 = abstractC1537c02.G();
                break;
        }
        return H2 - I8;
    }

    @Override // c0.g
    public final int o(View view) {
        switch (this.f14778d) {
            case 0:
                AbstractC1537c0 abstractC1537c0 = (AbstractC1537c0) this.f9383b;
                Rect rect = (Rect) this.f9384c;
                abstractC1537c0.N(view, rect);
                return rect.right;
            default:
                AbstractC1537c0 abstractC1537c02 = (AbstractC1537c0) this.f9383b;
                Rect rect2 = (Rect) this.f9384c;
                abstractC1537c02.N(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // c0.g
    public final int p(View view) {
        switch (this.f14778d) {
            case 0:
                AbstractC1537c0 abstractC1537c0 = (AbstractC1537c0) this.f9383b;
                Rect rect = (Rect) this.f9384c;
                abstractC1537c0.N(view, rect);
                return rect.left;
            default:
                AbstractC1537c0 abstractC1537c02 = (AbstractC1537c0) this.f9383b;
                Rect rect2 = (Rect) this.f9384c;
                abstractC1537c02.N(view, rect2);
                return rect2.top;
        }
    }

    @Override // c0.g
    public final void q(int i4) {
        switch (this.f14778d) {
            case 0:
                ((AbstractC1537c0) this.f9383b).S(i4);
                return;
            default:
                ((AbstractC1537c0) this.f9383b).T(i4);
                return;
        }
    }
}
