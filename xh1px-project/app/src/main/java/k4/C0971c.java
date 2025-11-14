package k4;

import L7.AbstractC0166y;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.buzbuz.smartautoclicker.R;
import j3.C0933s;
import l0.C0997a;
import l4.C1022b;

/* renamed from: k4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0971c extends E1.c {

    /* renamed from: I, reason: collision with root package name */
    public final C1022b f12081I;

    /* renamed from: J, reason: collision with root package name */
    public final A4.d f12082J;
    public F3.l K;

    /* renamed from: L, reason: collision with root package name */
    public N2.d f12083L;

    /* renamed from: M, reason: collision with root package name */
    public int f12084M;

    public C0971c(C1022b c1022b) {
        super(3);
        this.f12081I = c1022b;
        this.f12082J = new A4.d(o6.v.f13643a.b(C0977i.class), new C0970b(this, 0), new C0970b(this, 1), new C0933s(3, this));
    }

    @Override // E1.c
    public final FrameLayout I(LayoutInflater layoutInflater) {
        this.f12083L = new N2.d(k(), l(), new W4.i(1, this, C0971c.class, "onSelectorValidityChanged", "onSelectorValidityChanged(Z)V", 0, 0, 9));
        F3.l a3 = F3.l.a(layoutInflater);
        this.K = a3;
        FrameLayout frameLayout = a3.f1368e;
        o6.j.d(frameLayout, "getRoot(...)");
        return frameLayout;
    }

    @Override // E1.c
    public final View J() {
        N2.d dVar = this.f12083L;
        if (dVar != null) {
            return dVar;
        }
        o6.j.i("selectorView");
        throw null;
    }

    @Override // E1.c
    public final void K(int i4) {
        if (i4 == R.id.btn_confirm) {
            int i8 = this.f12084M;
            A4.d dVar = this.f12082J;
            if (i8 != 1) {
                if (i8 == 3) {
                    S(4);
                    try {
                        N2.d dVar2 = this.f12083L;
                        if (dVar2 != null) {
                            Z5.j selection = dVar2.getSelection();
                            C0977i c0977i = (C0977i) dVar.getValue();
                            Context k = k();
                            Rect rect = (Rect) selection.f7485d;
                            Bitmap bitmap = (Bitmap) selection.f7486e;
                            C0969a c0969a = new C0969a(this, 1);
                            o6.j.e(rect, "area");
                            o6.j.e(bitmap, "bitmap");
                            C0997a g8 = androidx.lifecycle.U.g(c0977i);
                            S7.e eVar = L7.F.f3175a;
                            AbstractC0166y.q(g8, S7.d.f5456f, null, new C0973e(c0977i, k, rect, bitmap, c0969a, null), 2);
                            return;
                        }
                        o6.j.i("selectorView");
                        throw null;
                    } catch (IllegalStateException e9) {
                        Log.e("ConditionSelectorMenu", "Condition selection failed", e9);
                        S(3);
                        return;
                    }
                }
                return;
            }
            S(2);
            C0977i c0977i2 = (C0977i) dVar.getValue();
            C0969a c0969a2 = new C0969a(this, 0);
            C0997a g9 = androidx.lifecycle.U.g(c0977i2);
            S7.e eVar2 = L7.F.f3175a;
            AbstractC0166y.q(g9, S7.d.f5456f, null, new C0976h(null, c0969a2, c0977i2), 2);
            return;
        }
        if (i4 == R.id.btn_cancel) {
            int i9 = this.f12084M;
            if (i9 != 1) {
                if (i9 == 3) {
                    S(1);
                    return;
                }
                return;
            }
            a();
        }
    }

    public final void S(int i4) {
        this.f12084M = i4;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        return;
                    }
                    F3.l lVar = this.K;
                    if (lVar != null) {
                        O(lVar.f1370g, false, false);
                        F3.l lVar2 = this.K;
                        if (lVar2 != null) {
                            O(lVar2.f1369f, false, false);
                            N2.d dVar = this.f12083L;
                            if (dVar != null) {
                                dVar.setHide(false);
                                return;
                            } else {
                                o6.j.i("selectorView");
                                throw null;
                            }
                        }
                        o6.j.i("viewBinding");
                        throw null;
                    }
                    o6.j.i("viewBinding");
                    throw null;
                }
                F3.l lVar3 = this.K;
                if (lVar3 != null) {
                    lVar3.f1370g.setImageResource(R.drawable.ic_confirm);
                    ViewGroup viewGroup = this.f1171w;
                    if (viewGroup != null) {
                        viewGroup.setVisibility(0);
                        N2.d dVar2 = this.f12083L;
                        if (dVar2 != null) {
                            dVar2.setHide(false);
                            return;
                        } else {
                            o6.j.i("selectorView");
                            throw null;
                        }
                    }
                    o6.j.i("menuLayout");
                    throw null;
                }
                o6.j.i("viewBinding");
                throw null;
            }
            ViewGroup viewGroup2 = this.f1171w;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
                Q(true);
                N2.d dVar3 = this.f12083L;
                if (dVar3 != null) {
                    dVar3.setHide(true);
                    return;
                } else {
                    o6.j.i("selectorView");
                    throw null;
                }
            }
            o6.j.i("menuLayout");
            throw null;
        }
        F3.l lVar4 = this.K;
        if (lVar4 != null) {
            lVar4.f1370g.setImageResource(R.drawable.ic_capture);
            ViewGroup viewGroup3 = this.f1171w;
            if (viewGroup3 != null) {
                viewGroup3.setVisibility(0);
                Q(false);
                N2.d dVar4 = this.f12083L;
                if (dVar4 != null) {
                    dVar4.setHide(true);
                    return;
                } else {
                    o6.j.i("selectorView");
                    throw null;
                }
            }
            o6.j.i("menuLayout");
            throw null;
        }
        o6.j.i("viewBinding");
        throw null;
    }

    @Override // w1.e
    public final void v() {
        S(1);
    }
}
