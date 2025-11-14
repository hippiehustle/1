package Q0;

import N0.I;
import a1.C0415b;
import android.graphics.PointF;

/* loaded from: classes.dex */
public final class p extends R3.r {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0415b f4749g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ R3.r f4750h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ S0.b f4751i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(C0415b c0415b, R3.r rVar, S0.b bVar) {
        super(9);
        this.f4749g = c0415b;
        this.f4750h = rVar;
        this.f4751i = bVar;
    }

    @Override // R3.r
    public final Object S(C0415b c0415b) {
        Object obj;
        float f8 = c0415b.f7684a;
        float f9 = c0415b.f7685b;
        String str = ((S0.b) c0415b.f7686c).f5178a;
        String str2 = ((S0.b) c0415b.f7687d).f5178a;
        float f10 = c0415b.f7688e;
        float f11 = c0415b.f7689f;
        float f12 = c0415b.f7690g;
        C0415b c0415b2 = this.f4749g;
        c0415b2.f7684a = f8;
        c0415b2.f7685b = f9;
        c0415b2.f7686c = str;
        c0415b2.f7687d = str2;
        c0415b2.f7688e = f10;
        c0415b2.f7689f = f11;
        c0415b2.f7690g = f12;
        String str3 = (String) ((I) this.f4750h.f5083f);
        if (c0415b.f7689f == 1.0f) {
            obj = c0415b.f7687d;
        } else {
            obj = c0415b.f7686c;
        }
        S0.b bVar = (S0.b) obj;
        String str4 = bVar.f5179b;
        float f13 = bVar.f5180c;
        int i4 = bVar.f5181d;
        int i8 = bVar.f5182e;
        float f14 = bVar.f5183f;
        float f15 = bVar.f5184g;
        int i9 = bVar.f5185h;
        int i10 = bVar.f5186i;
        float f16 = bVar.j;
        boolean z8 = bVar.k;
        PointF pointF = bVar.f5187l;
        PointF pointF2 = bVar.f5188m;
        S0.b bVar2 = this.f4751i;
        bVar2.f5178a = str3;
        bVar2.f5179b = str4;
        bVar2.f5180c = f13;
        bVar2.f5181d = i4;
        bVar2.f5182e = i8;
        bVar2.f5183f = f14;
        bVar2.f5184g = f15;
        bVar2.f5185h = i9;
        bVar2.f5186i = i10;
        bVar2.j = f16;
        bVar2.k = z8;
        bVar2.f5187l = pointF;
        bVar2.f5188m = pointF2;
        return bVar2;
    }
}
