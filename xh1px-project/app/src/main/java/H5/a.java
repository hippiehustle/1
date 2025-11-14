package H5;

import a.AbstractC0405a;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final class a extends AbstractC0405a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2018f;

    /* renamed from: g, reason: collision with root package name */
    public final SideSheetBehavior f2019g;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i4) {
        this.f2018f = i4;
        this.f2019g = sideSheetBehavior;
    }

    @Override // a.AbstractC0405a
    public final int D(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f2018f) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // a.AbstractC0405a
    public final int H() {
        switch (this.f2018f) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f2019g;
                return Math.max(0, sideSheetBehavior.f10219n + sideSheetBehavior.f10220o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f2019g;
                return Math.max(0, (sideSheetBehavior2.f10218m - sideSheetBehavior2.f10217l) - sideSheetBehavior2.f10220o);
        }
    }

    @Override // a.AbstractC0405a
    public final int I() {
        switch (this.f2018f) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f2019g;
                return (-sideSheetBehavior.f10217l) - sideSheetBehavior.f10220o;
            default:
                return this.f2019g.f10218m;
        }
    }

    @Override // a.AbstractC0405a
    public final void I0(ViewGroup.MarginLayoutParams marginLayoutParams, int i4) {
        switch (this.f2018f) {
            case 0:
                marginLayoutParams.leftMargin = i4;
                return;
            default:
                marginLayoutParams.rightMargin = i4;
                return;
        }
    }

    @Override // a.AbstractC0405a
    public final void J0(ViewGroup.MarginLayoutParams marginLayoutParams, int i4, int i8) {
        switch (this.f2018f) {
            case 0:
                if (i4 <= this.f2019g.f10218m) {
                    marginLayoutParams.leftMargin = i8;
                    return;
                }
                return;
            default:
                int i9 = this.f2019g.f10218m;
                if (i4 <= i9) {
                    marginLayoutParams.rightMargin = i9 - i4;
                    return;
                }
                return;
        }
    }

    @Override // a.AbstractC0405a
    public final int K() {
        switch (this.f2018f) {
            case 0:
                return this.f2019g.f10220o;
            default:
                return this.f2019g.f10218m;
        }
    }

    @Override // a.AbstractC0405a
    public final int L() {
        switch (this.f2018f) {
            case 0:
                return -this.f2019g.f10217l;
            default:
                return H();
        }
    }

    @Override // a.AbstractC0405a
    public final int M(View view) {
        switch (this.f2018f) {
            case 0:
                return view.getRight() + this.f2019g.f10220o;
            default:
                return view.getLeft() - this.f2019g.f10220o;
        }
    }

    @Override // a.AbstractC0405a
    public final int N(CoordinatorLayout coordinatorLayout) {
        switch (this.f2018f) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // a.AbstractC0405a
    public final int P() {
        switch (this.f2018f) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // a.AbstractC0405a
    public final boolean Z(float f8) {
        switch (this.f2018f) {
            case 0:
                return f8 > 0.0f;
            default:
                return f8 < 0.0f;
        }
    }

    @Override // a.AbstractC0405a
    public final boolean c0(View view) {
        switch (this.f2018f) {
            case 0:
                if (view.getRight() < (H() - I()) / 2) {
                    return true;
                }
                return false;
            default:
                if (view.getLeft() > (H() + this.f2019g.f10218m) / 2) {
                    return true;
                }
                return false;
        }
    }

    @Override // a.AbstractC0405a
    public final boolean d0(float f8, float f9) {
        switch (this.f2018f) {
            case 0:
                if (Math.abs(f8) > Math.abs(f9) && Math.abs(f8) > 500) {
                    return true;
                }
                return false;
            default:
                if (Math.abs(f8) > Math.abs(f9) && Math.abs(f8) > 500) {
                    return true;
                }
                return false;
        }
    }

    @Override // a.AbstractC0405a
    public final int g(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f2018f) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // a.AbstractC0405a
    public final float h(int i4) {
        switch (this.f2018f) {
            case 0:
                float I8 = I();
                return (i4 - I8) / (H() - I8);
            default:
                float f8 = this.f2019g.f10218m;
                return (f8 - i4) / (f8 - H());
        }
    }

    @Override // a.AbstractC0405a
    public final boolean z0(View view, float f8) {
        switch (this.f2018f) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f2019g;
                float abs = Math.abs((f8 * sideSheetBehavior.k) + left);
                sideSheetBehavior.getClass();
                if (abs > 0.5f) {
                    return true;
                }
                return false;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f2019g;
                float abs2 = Math.abs((f8 * sideSheetBehavior2.k) + right);
                sideSheetBehavior2.getClass();
                if (abs2 > 0.5f) {
                    return true;
                }
                return false;
        }
    }
}
