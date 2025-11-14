package t0;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class s0 {

    /* renamed from: t, reason: collision with root package name */
    public static final List f14949t = Collections.EMPTY_LIST;

    /* renamed from: a, reason: collision with root package name */
    public final View f14950a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f14951b;
    public int j;

    /* renamed from: r, reason: collision with root package name */
    public RecyclerView f14965r;

    /* renamed from: s, reason: collision with root package name */
    public U f14966s;

    /* renamed from: c, reason: collision with root package name */
    public int f14952c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f14953d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f14954e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f14955f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f14956g = -1;

    /* renamed from: h, reason: collision with root package name */
    public s0 f14957h = null;

    /* renamed from: i, reason: collision with root package name */
    public s0 f14958i = null;
    public final ArrayList k = null;

    /* renamed from: l, reason: collision with root package name */
    public final List f14959l = null;

    /* renamed from: m, reason: collision with root package name */
    public int f14960m = 0;

    /* renamed from: n, reason: collision with root package name */
    public j0 f14961n = null;

    /* renamed from: o, reason: collision with root package name */
    public boolean f14962o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f14963p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f14964q = -1;

    public s0(View view) {
        if (view != null) {
            this.f14950a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void a(int i4) {
        this.j = i4 | this.j;
    }

    public final int b() {
        RecyclerView recyclerView = this.f14965r;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.K(this);
    }

    public final int c() {
        RecyclerView recyclerView;
        U adapter;
        int K;
        if (this.f14966s == null || (recyclerView = this.f14965r) == null || (adapter = recyclerView.getAdapter()) == null || (K = this.f14965r.K(this)) == -1 || this.f14966s != adapter) {
            return -1;
        }
        return K;
    }

    public final int d() {
        int i4 = this.f14956g;
        if (i4 == -1) {
            return this.f14952c;
        }
        return i4;
    }

    public final List e() {
        ArrayList arrayList;
        if ((this.j & 1024) == 0 && (arrayList = this.k) != null && arrayList.size() != 0) {
            return this.f14959l;
        }
        return f14949t;
    }

    public final boolean f() {
        View view = this.f14950a;
        if (view.getParent() != null && view.getParent() != this.f14965r) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if ((this.j & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if ((this.j & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if ((this.j & 16) == 0) {
            WeakHashMap weakHashMap = P.O.f4214a;
            if (!this.f14950a.hasTransientState()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean j() {
        if ((this.j & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (this.f14961n != null) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if ((this.j & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if ((this.j & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void n(int i4, boolean z8) {
        if (this.f14953d == -1) {
            this.f14953d = this.f14952c;
        }
        if (this.f14956g == -1) {
            this.f14956g = this.f14952c;
        }
        if (z8) {
            this.f14956g += i4;
        }
        this.f14952c += i4;
        View view = this.f14950a;
        if (view.getLayoutParams() != null) {
            ((d0) view.getLayoutParams()).f14829c = true;
        }
    }

    public final void o() {
        if (RecyclerView.f8900F0 && l()) {
            throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
        }
        this.j = 0;
        this.f14952c = -1;
        this.f14953d = -1;
        this.f14954e = -1L;
        this.f14956g = -1;
        this.f14960m = 0;
        this.f14957h = null;
        this.f14958i = null;
        ArrayList arrayList = this.k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.j &= -1025;
        this.f14963p = 0;
        this.f14964q = -1;
        RecyclerView.l(this);
    }

    public final void p(boolean z8) {
        int i4;
        int i8 = this.f14960m;
        if (z8) {
            i4 = i8 - 1;
        } else {
            i4 = i8 + 1;
        }
        this.f14960m = i4;
        if (i4 < 0) {
            this.f14960m = 0;
            if (!RecyclerView.f8900F0) {
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
        } else if (!z8 && i4 == 1) {
            this.j |= 16;
        } else if (z8 && i4 == 0) {
            this.j &= -17;
        }
        if (RecyclerView.f8901G0) {
            toString();
        }
    }

    public final boolean q() {
        if ((this.j & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean r() {
        if ((this.j & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String simpleName;
        String str;
        if (getClass().isAnonymousClass()) {
            simpleName = "ViewHolder";
        } else {
            simpleName = getClass().getSimpleName();
        }
        StringBuilder sb = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.f14952c + " id=" + this.f14954e + ", oldPos=" + this.f14953d + ", pLpos:" + this.f14956g);
        if (k()) {
            sb.append(" scrap ");
            if (this.f14962o) {
                str = "[changeScrap]";
            } else {
                str = "[attachedScrap]";
            }
            sb.append(str);
        }
        if (h()) {
            sb.append(" invalid");
        }
        if (!g()) {
            sb.append(" unbound");
        }
        if ((this.j & 2) != 0) {
            sb.append(" update");
        }
        if (j()) {
            sb.append(" removed");
        }
        if (q()) {
            sb.append(" ignored");
        }
        if (l()) {
            sb.append(" tmpDetached");
        }
        if (!i()) {
            sb.append(" not recyclable(" + this.f14960m + ")");
        }
        if ((this.j & 512) != 0 || h()) {
            sb.append(" undefined adapter position");
        }
        if (this.f14950a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
