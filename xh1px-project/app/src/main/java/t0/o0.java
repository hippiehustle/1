package t0;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public int f14912a;

    /* renamed from: b, reason: collision with root package name */
    public int f14913b;

    /* renamed from: c, reason: collision with root package name */
    public int f14914c;

    /* renamed from: d, reason: collision with root package name */
    public int f14915d;

    /* renamed from: e, reason: collision with root package name */
    public int f14916e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14917f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f14918g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f14919h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f14920i;
    public boolean j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public int f14921l;

    /* renamed from: m, reason: collision with root package name */
    public long f14922m;

    /* renamed from: n, reason: collision with root package name */
    public int f14923n;

    public final void a(int i4) {
        if ((this.f14915d & i4) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i4) + " but it is " + Integer.toBinaryString(this.f14915d));
    }

    public final int b() {
        if (this.f14918g) {
            return this.f14913b - this.f14914c;
        }
        return this.f14916e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f14912a + ", mData=null, mItemCount=" + this.f14916e + ", mIsMeasuring=" + this.f14920i + ", mPreviousLayoutItemCount=" + this.f14913b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f14914c + ", mStructureChanged=" + this.f14917f + ", mInPreLayout=" + this.f14918g + ", mRunSimpleAnimations=" + this.j + ", mRunPredictiveAnimations=" + this.k + '}';
    }
}
