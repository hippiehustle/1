package t;

import a6.AbstractC0436k;
import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import t0.AbstractC1537c0;
import t0.x0;
import t7.C1594d;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14661a;

    /* renamed from: b, reason: collision with root package name */
    public int f14662b;

    /* renamed from: c, reason: collision with root package name */
    public int f14663c;

    /* renamed from: d, reason: collision with root package name */
    public int f14664d;

    /* renamed from: e, reason: collision with root package name */
    public int f14665e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f14666f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f14667g;

    public i(int i4) {
        this.f14661a = 0;
        this.f14662b = i4;
        if (i4 > 0) {
            this.f14666f = new C1.a(3);
            this.f14667g = new Object();
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public void a() {
        View view = (View) ((ArrayList) this.f14666f).get(r0.size() - 1);
        x0 x0Var = (x0) view.getLayoutParams();
        this.f14663c = ((StaggeredGridLayoutManager) this.f14667g).f8994r.d(view);
        x0Var.getClass();
    }

    public void b() {
        ((ArrayList) this.f14666f).clear();
        this.f14662b = Integer.MIN_VALUE;
        this.f14663c = Integer.MIN_VALUE;
        this.f14664d = 0;
    }

    public int c() {
        ArrayList arrayList = (ArrayList) this.f14666f;
        if (((StaggeredGridLayoutManager) this.f14667g).f8999w) {
            return e(arrayList.size() - 1, -1);
        }
        return e(0, arrayList.size());
    }

    public int d() {
        ArrayList arrayList = (ArrayList) this.f14666f;
        if (((StaggeredGridLayoutManager) this.f14667g).f8999w) {
            return e(0, arrayList.size());
        }
        return e(arrayList.size() - 1, -1);
    }

    public int e(int i4, int i8) {
        int i9;
        boolean z8;
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f14667g;
        int m6 = staggeredGridLayoutManager.f8994r.m();
        int i10 = staggeredGridLayoutManager.f8994r.i();
        if (i8 > i4) {
            i9 = 1;
        } else {
            i9 = -1;
        }
        while (i4 != i8) {
            View view = (View) ((ArrayList) this.f14666f).get(i4);
            int g8 = staggeredGridLayoutManager.f8994r.g(view);
            int d2 = staggeredGridLayoutManager.f8994r.d(view);
            boolean z9 = false;
            if (g8 <= i10) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (d2 >= m6) {
                z9 = true;
            }
            if (z8 && z9 && (g8 < m6 || d2 > i10)) {
                return AbstractC1537c0.K(view);
            }
            i4 += i9;
        }
        return -1;
    }

    public Object f(Object obj) {
        o6.j.e(obj, "key");
        synchronized (((C1594d) this.f14667g)) {
            C1.a aVar = (C1.a) this.f14666f;
            aVar.getClass();
            Object obj2 = aVar.f561a.get(obj);
            if (obj2 != null) {
                this.f14664d++;
                return obj2;
            }
            this.f14665e++;
            return null;
        }
    }

    public int g(int i4) {
        int i8 = this.f14663c;
        if (i8 != Integer.MIN_VALUE) {
            return i8;
        }
        if (((ArrayList) this.f14666f).size() == 0) {
            return i4;
        }
        a();
        return this.f14663c;
    }

    public View h(int i4, int i8) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f14667g;
        ArrayList arrayList = (ArrayList) this.f14666f;
        View view = null;
        if (i8 == -1) {
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                View view2 = (View) arrayList.get(i9);
                if ((staggeredGridLayoutManager.f8999w && AbstractC1537c0.K(view2) <= i4) || ((!staggeredGridLayoutManager.f8999w && AbstractC1537c0.K(view2) >= i4) || !view2.hasFocusable())) {
                    break;
                }
                i9++;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size() - 1;
        while (size2 >= 0) {
            View view3 = (View) arrayList.get(size2);
            if ((staggeredGridLayoutManager.f8999w && AbstractC1537c0.K(view3) >= i4) || ((!staggeredGridLayoutManager.f8999w && AbstractC1537c0.K(view3) <= i4) || !view3.hasFocusable())) {
                break;
            }
            size2--;
            view = view3;
        }
        return view;
    }

    public int i(int i4) {
        int i8 = this.f14662b;
        if (i8 != Integer.MIN_VALUE) {
            return i8;
        }
        if (((ArrayList) this.f14666f).size() == 0) {
            return i4;
        }
        View view = (View) ((ArrayList) this.f14666f).get(0);
        x0 x0Var = (x0) view.getLayoutParams();
        this.f14662b = ((StaggeredGridLayoutManager) this.f14667g).f8994r.g(view);
        x0Var.getClass();
        return this.f14662b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a6, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object j(Object obj, Object obj2) {
        Object put;
        o6.j.e(obj, "key");
        o6.j.e(obj2, "value");
        synchronized (((C1594d) this.f14667g)) {
            this.f14663c++;
            C1.a aVar = (C1.a) this.f14666f;
            aVar.getClass();
            put = aVar.f561a.put(obj, obj2);
            if (put != null) {
                this.f14663c--;
            }
        }
        int i4 = this.f14662b;
        while (true) {
            synchronized (((C1594d) this.f14667g)) {
                try {
                    if (this.f14663c < 0 || (((C1.a) this.f14666f).f561a.isEmpty() && this.f14663c != 0)) {
                        break;
                    }
                    if (this.f14663c <= i4 || ((C1.a) this.f14666f).f561a.isEmpty()) {
                        break;
                    }
                    Set entrySet = ((C1.a) this.f14666f).f561a.entrySet();
                    o6.j.d(entrySet, "map.entries");
                    Map.Entry entry = (Map.Entry) AbstractC0436k.q0(entrySet);
                    if (entry == null) {
                        return put;
                    }
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    C1.a aVar2 = (C1.a) this.f14666f;
                    aVar2.getClass();
                    o6.j.e(key, "key");
                    aVar2.f561a.remove(key);
                    int i8 = this.f14663c;
                    o6.j.e(value, "value");
                    this.f14663c = i8 - 1;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return put;
    }

    public String toString() {
        int i4;
        String str;
        switch (this.f14661a) {
            case 0:
                synchronized (((C1594d) this.f14667g)) {
                    try {
                        int i8 = this.f14664d;
                        int i9 = this.f14665e + i8;
                        if (i9 != 0) {
                            i4 = (i8 * 100) / i9;
                        } else {
                            i4 = 0;
                        }
                        str = "LruCache[maxSize=" + this.f14662b + ",hits=" + this.f14664d + ",misses=" + this.f14665e + ",hitRate=" + i4 + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public i(StaggeredGridLayoutManager staggeredGridLayoutManager, int i4) {
        this.f14661a = 1;
        this.f14667g = staggeredGridLayoutManager;
        this.f14666f = new ArrayList();
        this.f14662b = Integer.MIN_VALUE;
        this.f14663c = Integer.MIN_VALUE;
        this.f14664d = 0;
        this.f14665e = i4;
    }
}
