package g5;

import P.O;
import a6.AbstractC0434i;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;
import t0.AbstractC1537c0;
import w0.j;

/* renamed from: g5.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0787g {

    /* renamed from: a, reason: collision with root package name */
    public int f11187a;

    /* renamed from: b, reason: collision with root package name */
    public int f11188b;

    /* renamed from: c, reason: collision with root package name */
    public int f11189c;

    /* renamed from: d, reason: collision with root package name */
    public Object f11190d;

    public void a(j jVar) {
        Object[] objArr = (Object[]) this.f11190d;
        int i4 = this.f11188b;
        objArr[i4] = jVar;
        int i8 = this.f11189c & (i4 + 1);
        this.f11188b = i8;
        int i9 = this.f11187a;
        if (i8 == i9) {
            int length = objArr.length;
            int i10 = length - i9;
            int i11 = length << 1;
            if (i11 >= 0) {
                Object[] objArr2 = new Object[i11];
                AbstractC0434i.Q0(objArr, objArr2, 0, i9, length);
                AbstractC0434i.Q0((Object[]) this.f11190d, objArr2, i10, 0, this.f11187a);
                this.f11190d = objArr2;
                this.f11187a = 0;
                this.f11188b = length;
                this.f11189c = i11 - 1;
                return;
            }
            throw new RuntimeException("Max array capacity exceeded");
        }
    }

    public void b(int i4, int i8) {
        if (i4 >= 0) {
            if (i8 >= 0) {
                int i9 = this.f11189c;
                int i10 = i9 * 2;
                int[] iArr = (int[]) this.f11190d;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f11190d = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i10 >= iArr.length) {
                    int[] iArr3 = new int[i9 * 4];
                    this.f11190d = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = (int[]) this.f11190d;
                iArr4[i10] = i4;
                iArr4[i10 + 1] = i8;
                this.f11189c++;
                return;
            }
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        throw new IllegalArgumentException("Layout positions must be non-negative");
    }

    public void c() {
        View view = (View) this.f11190d;
        int top = this.f11189c - (view.getTop() - this.f11187a);
        WeakHashMap weakHashMap = O.f4214a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.f11188b));
    }

    public void d(RecyclerView recyclerView, boolean z8) {
        this.f11189c = 0;
        int[] iArr = (int[]) this.f11190d;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AbstractC1537c0 abstractC1537c0 = recyclerView.f8962q;
        if (recyclerView.f8960p != null && abstractC1537c0 != null && abstractC1537c0.f14818i) {
            if (z8) {
                if (!recyclerView.f8947h.j()) {
                    abstractC1537c0.i(recyclerView.f8960p.a(), this);
                }
            } else if (!recyclerView.Q()) {
                abstractC1537c0.h(this.f11187a, this.f11188b, recyclerView.f8951k0, this);
            }
            int i4 = this.f11189c;
            if (i4 > abstractC1537c0.j) {
                abstractC1537c0.j = i4;
                abstractC1537c0.k = z8;
                recyclerView.f8943f.m();
            }
        }
    }
}
