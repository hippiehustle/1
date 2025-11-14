package t0;

import P.InterfaceC0260h;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class T implements InterfaceC0260h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f14787d;

    public /* synthetic */ T(RecyclerView recyclerView) {
        this.f14787d = recyclerView;
    }

    public void a(C1532a c1532a) {
        int i4 = c1532a.f14797a;
        RecyclerView recyclerView = this.f14787d;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 4) {
                    if (i4 != 8) {
                        return;
                    }
                    recyclerView.f8962q.e0(c1532a.f14798b, c1532a.f14799c);
                    return;
                }
                recyclerView.f8962q.g0(c1532a.f14798b, c1532a.f14799c);
                return;
            }
            recyclerView.f8962q.f0(c1532a.f14798b, c1532a.f14799c);
            return;
        }
        recyclerView.f8962q.c0(c1532a.f14798b, c1532a.f14799c);
    }

    public s0 b(int i4) {
        RecyclerView recyclerView = this.f14787d;
        int w8 = recyclerView.f8949i.w();
        int i8 = 0;
        s0 s0Var = null;
        while (true) {
            if (i8 >= w8) {
                break;
            }
            s0 N8 = RecyclerView.N(recyclerView.f8949i.v(i8));
            if (N8 != null && !N8.j() && N8.f14952c == i4) {
                if (((ArrayList) recyclerView.f8949i.f5432e).contains(N8.f14950a)) {
                    s0Var = N8;
                } else {
                    s0Var = N8;
                    break;
                }
            }
            i8++;
        }
        if (s0Var == null) {
            return null;
        }
        if (((ArrayList) recyclerView.f8949i.f5432e).contains(s0Var.f14950a)) {
            boolean z8 = RecyclerView.f8900F0;
            return null;
        }
        return s0Var;
    }

    public void c(int i4, int i8) {
        int i9;
        int i10;
        RecyclerView recyclerView = this.f14787d;
        int w8 = recyclerView.f8949i.w();
        int i11 = i8 + i4;
        for (int i12 = 0; i12 < w8; i12++) {
            View v8 = recyclerView.f8949i.v(i12);
            s0 N8 = RecyclerView.N(v8);
            if (N8 != null && !N8.q() && (i10 = N8.f14952c) >= i4 && i10 < i11) {
                N8.a(2);
                N8.a(1024);
                ((d0) v8.getLayoutParams()).f14829c = true;
            }
        }
        j0 j0Var = recyclerView.f8943f;
        ArrayList arrayList = j0Var.f14868c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            s0 s0Var = (s0) arrayList.get(size);
            if (s0Var != null && (i9 = s0Var.f14952c) >= i4 && i9 < i11) {
                s0Var.a(2);
                j0Var.g(size);
            }
        }
        recyclerView.f8959o0 = true;
    }

    @Override // P.InterfaceC0260h
    public boolean d(float f8) {
        int i4;
        int i8;
        RecyclerView recyclerView = this.f14787d;
        if (recyclerView.f8962q.e()) {
            i8 = (int) f8;
            i4 = 0;
        } else if (recyclerView.f8962q.d()) {
            i4 = (int) f8;
            i8 = 0;
        } else {
            i4 = 0;
            i8 = 0;
        }
        if (i4 == 0 && i8 == 0) {
            return false;
        }
        recyclerView.r0();
        return recyclerView.J(i4, i8, 0, Integer.MAX_VALUE);
    }

    public void e(int i4, int i8) {
        RecyclerView recyclerView = this.f14787d;
        int w8 = recyclerView.f8949i.w();
        for (int i9 = 0; i9 < w8; i9++) {
            s0 N8 = RecyclerView.N(recyclerView.f8949i.v(i9));
            if (N8 != null && !N8.q() && N8.f14952c >= i4) {
                if (RecyclerView.f8901G0) {
                    N8.toString();
                }
                N8.n(i8, false);
                recyclerView.f8951k0.f14917f = true;
            }
        }
        ArrayList arrayList = recyclerView.f8943f.f14868c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            s0 s0Var = (s0) arrayList.get(i10);
            if (s0Var != null && s0Var.f14952c >= i4) {
                if (RecyclerView.f8901G0) {
                    s0Var.toString();
                }
                s0Var.n(i8, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f8957n0 = true;
    }

    @Override // P.InterfaceC0260h
    public float f() {
        float f8;
        RecyclerView recyclerView = this.f14787d;
        if (recyclerView.f8962q.e()) {
            f8 = recyclerView.f8944f0;
        } else if (recyclerView.f8962q.d()) {
            f8 = recyclerView.f8942e0;
        } else {
            return 0.0f;
        }
        return -f8;
    }

    public void g(int i4, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        RecyclerView recyclerView = this.f14787d;
        int w8 = recyclerView.f8949i.w();
        int i16 = -1;
        if (i4 < i8) {
            i10 = i4;
            i9 = i8;
            i11 = -1;
        } else {
            i9 = i4;
            i10 = i8;
            i11 = 1;
        }
        for (int i17 = 0; i17 < w8; i17++) {
            s0 N8 = RecyclerView.N(recyclerView.f8949i.v(i17));
            if (N8 != null && (i15 = N8.f14952c) >= i10 && i15 <= i9) {
                if (RecyclerView.f8901G0) {
                    N8.toString();
                }
                if (N8.f14952c == i4) {
                    N8.n(i8 - i4, false);
                } else {
                    N8.n(i11, false);
                }
                recyclerView.f8951k0.f14917f = true;
            }
        }
        ArrayList arrayList = recyclerView.f8943f.f14868c;
        if (i4 < i8) {
            i13 = i4;
            i12 = i8;
        } else {
            i12 = i4;
            i13 = i8;
            i16 = 1;
        }
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            s0 s0Var = (s0) arrayList.get(i18);
            if (s0Var != null && (i14 = s0Var.f14952c) >= i13 && i14 <= i12) {
                if (i14 == i4) {
                    s0Var.n(i8 - i4, false);
                } else {
                    s0Var.n(i16, false);
                }
                if (RecyclerView.f8901G0) {
                    s0Var.toString();
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f8957n0 = true;
    }

    @Override // P.InterfaceC0260h
    public void h() {
        this.f14787d.r0();
    }
}
