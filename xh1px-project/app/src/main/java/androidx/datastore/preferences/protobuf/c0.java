package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class c0 extends e0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8665b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(Unsafe unsafe, int i4) {
        super(unsafe);
        this.f8665b = i4;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final boolean c(long j, Object obj) {
        switch (this.f8665b) {
            case 0:
                if (f0.f8680g) {
                    return f0.b(j, obj);
                }
                return f0.c(j, obj);
            default:
                if (f0.f8680g) {
                    return f0.b(j, obj);
                }
                return f0.c(j, obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final double d(long j, Object obj) {
        switch (this.f8665b) {
            case 0:
                return Double.longBitsToDouble(g(j, obj));
            default:
                return Double.longBitsToDouble(g(j, obj));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final float e(long j, Object obj) {
        switch (this.f8665b) {
            case 0:
                return Float.intBitsToFloat(f(j, obj));
            default:
                return Float.intBitsToFloat(f(j, obj));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final void j(Object obj, long j, boolean z8) {
        switch (this.f8665b) {
            case 0:
                if (f0.f8680g) {
                    f0.k(obj, j, z8 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    f0.l(obj, j, z8 ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (f0.f8680g) {
                    f0.k(obj, j, z8 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    f0.l(obj, j, z8 ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final void k(Object obj, long j, byte b4) {
        switch (this.f8665b) {
            case 0:
                if (f0.f8680g) {
                    f0.k(obj, j, b4);
                    return;
                } else {
                    f0.l(obj, j, b4);
                    return;
                }
            default:
                if (f0.f8680g) {
                    f0.k(obj, j, b4);
                    return;
                } else {
                    f0.l(obj, j, b4);
                    return;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final void l(Object obj, long j, double d2) {
        switch (this.f8665b) {
            case 0:
                o(obj, j, Double.doubleToLongBits(d2));
                return;
            default:
                o(obj, j, Double.doubleToLongBits(d2));
                return;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final void m(Object obj, long j, float f8) {
        switch (this.f8665b) {
            case 0:
                n(Float.floatToIntBits(f8), j, obj);
                return;
            default:
                n(Float.floatToIntBits(f8), j, obj);
                return;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final boolean r() {
        switch (this.f8665b) {
            case 0:
                return false;
            default:
                return false;
        }
    }
}
