package Q0;

import a1.C0414a;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class o extends e {

    /* renamed from: i, reason: collision with root package name */
    public final PointF f4745i;
    public final PointF j;
    public final i k;

    /* renamed from: l, reason: collision with root package name */
    public final i f4746l;

    /* renamed from: m, reason: collision with root package name */
    public R3.r f4747m;

    /* renamed from: n, reason: collision with root package name */
    public R3.r f4748n;

    public o(i iVar, i iVar2) {
        super(Collections.EMPTY_LIST);
        this.f4745i = new PointF();
        this.j = new PointF();
        this.k = iVar;
        this.f4746l = iVar2;
        i(this.f4721d);
    }

    @Override // Q0.e
    public final Object e() {
        return l();
    }

    @Override // Q0.e
    public final /* bridge */ /* synthetic */ Object f(C0414a c0414a, float f8) {
        return l();
    }

    @Override // Q0.e
    public final void i(float f8) {
        i iVar = this.k;
        iVar.i(f8);
        i iVar2 = this.f4746l;
        iVar2.i(f8);
        this.f4745i.set(((Float) iVar.e()).floatValue(), ((Float) iVar2.e()).floatValue());
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f4718a;
            if (i4 < arrayList.size()) {
                ((a) arrayList.get(i4)).b();
                i4++;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PointF l() {
        Float f8;
        float floatValue;
        float floatValue2;
        Float f9 = null;
        if (this.f4747m != null) {
            i iVar = this.k;
            C0414a g8 = iVar.f4720c.g();
            if (g8 != null) {
                Float f10 = g8.f7677h;
                R3.r rVar = this.f4747m;
                float f11 = g8.f7676g;
                if (f10 == null) {
                    floatValue2 = f11;
                } else {
                    floatValue2 = f10.floatValue();
                }
                f8 = (Float) rVar.T(f11, floatValue2, (Float) g8.f7671b, (Float) g8.f7672c, iVar.c(), iVar.d(), iVar.f4721d);
                if (this.f4748n != null) {
                    i iVar2 = this.f4746l;
                    C0414a g9 = iVar2.f4720c.g();
                    if (g9 != null) {
                        Float f12 = g9.f7677h;
                        R3.r rVar2 = this.f4748n;
                        float f13 = g9.f7676g;
                        if (f12 == null) {
                            floatValue = f13;
                        } else {
                            floatValue = f12.floatValue();
                        }
                        f9 = (Float) rVar2.T(f13, floatValue, (Float) g9.f7671b, (Float) g9.f7672c, iVar2.c(), iVar2.d(), iVar2.f4721d);
                    }
                }
                PointF pointF = this.f4745i;
                PointF pointF2 = this.j;
                if (f8 != null) {
                    pointF2.set(pointF.x, 0.0f);
                } else {
                    pointF2.set(f8.floatValue(), 0.0f);
                }
                if (f9 != null) {
                    pointF2.set(pointF2.x, pointF.y);
                    return pointF2;
                }
                pointF2.set(pointF2.x, f9.floatValue());
                return pointF2;
            }
        }
        f8 = null;
        if (this.f4748n != null) {
        }
        PointF pointF3 = this.f4745i;
        PointF pointF22 = this.j;
        if (f8 != null) {
        }
        if (f9 != null) {
        }
    }
}
