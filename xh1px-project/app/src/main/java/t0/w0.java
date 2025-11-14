package t0;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public int f15016a;

    /* renamed from: b, reason: collision with root package name */
    public int f15017b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15018c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15019d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f15020e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f15021f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f15022g;

    public w0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f15022g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f15016a = -1;
        this.f15017b = Integer.MIN_VALUE;
        this.f15018c = false;
        this.f15019d = false;
        this.f15020e = false;
        int[] iArr = this.f15021f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
