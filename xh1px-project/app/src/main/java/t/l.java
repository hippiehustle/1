package t;

import a6.w;

/* loaded from: classes.dex */
public final class l extends w {

    /* renamed from: d, reason: collision with root package name */
    public int f14675d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f14676e;

    public l(k kVar) {
        this.f14676e = kVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f14675d < this.f14676e.e()) {
            return true;
        }
        return false;
    }

    @Override // a6.w
    public final int nextInt() {
        int i4 = this.f14675d;
        this.f14675d = i4 + 1;
        return this.f14676e.c(i4);
    }
}
