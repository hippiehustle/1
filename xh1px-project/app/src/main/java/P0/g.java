package P0;

import N0.B;
import N0.x;
import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class g implements n, Q0.a, l {

    /* renamed from: b, reason: collision with root package name */
    public final String f4347b;

    /* renamed from: c, reason: collision with root package name */
    public final x f4348c;

    /* renamed from: d, reason: collision with root package name */
    public final Q0.j f4349d;

    /* renamed from: e, reason: collision with root package name */
    public final Q0.e f4350e;

    /* renamed from: f, reason: collision with root package name */
    public final U0.a f4351f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4353h;

    /* renamed from: a, reason: collision with root package name */
    public final Path f4346a = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final c f4352g = new c();

    public g(x xVar, V0.b bVar, U0.a aVar) {
        this.f4347b = aVar.f5938a;
        this.f4348c = xVar;
        Q0.e r02 = aVar.f5940c.r0();
        this.f4349d = (Q0.j) r02;
        Q0.e r03 = aVar.f5939b.r0();
        this.f4350e = r03;
        this.f4351f = aVar;
        bVar.d(r02);
        bVar.d(r03);
        r02.a(this);
        r03.a(this);
    }

    @Override // Q0.a
    public final void b() {
        this.f4353h = false;
        this.f4348c.invalidateSelf();
    }

    @Override // P0.d
    public final void c(List list, List list2) {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i4 < arrayList.size()) {
                d dVar = (d) arrayList.get(i4);
                if (dVar instanceof u) {
                    u uVar = (u) dVar;
                    if (uVar.f4449c == 1) {
                        this.f4352g.f4335d.add(uVar);
                        uVar.d(this);
                    }
                }
                i4++;
            } else {
                return;
            }
        }
    }

    @Override // S0.f
    public final void e(R3.r rVar, Object obj) {
        if (obj == B.f3545f) {
            this.f4349d.j(rVar);
        } else if (obj == B.f3548i) {
            this.f4350e.j(rVar);
        }
    }

    @Override // P0.n
    public final Path f() {
        boolean z8 = this.f4353h;
        Path path = this.f4346a;
        if (z8) {
            return path;
        }
        path.reset();
        U0.a aVar = this.f4351f;
        if (aVar.f5942e) {
            this.f4353h = true;
            return path;
        }
        PointF pointF = (PointF) this.f4349d.e();
        float f8 = pointF.x / 2.0f;
        float f9 = pointF.y / 2.0f;
        float f10 = f8 * 0.55228f;
        float f11 = f9 * 0.55228f;
        path.reset();
        if (aVar.f5941d) {
            float f12 = -f9;
            path.moveTo(0.0f, f12);
            float f13 = 0.0f - f10;
            float f14 = -f8;
            float f15 = 0.0f - f11;
            path.cubicTo(f13, f12, f14, f15, f14, 0.0f);
            float f16 = f11 + 0.0f;
            path.cubicTo(f14, f16, f13, f9, 0.0f, f9);
            float f17 = f10 + 0.0f;
            path.cubicTo(f17, f9, f8, f16, f8, 0.0f);
            path.cubicTo(f8, f15, f17, f12, 0.0f, f12);
        } else {
            float f18 = -f9;
            path.moveTo(0.0f, f18);
            float f19 = f10 + 0.0f;
            float f20 = 0.0f - f11;
            path.cubicTo(f19, f18, f8, f20, f8, 0.0f);
            float f21 = f11 + 0.0f;
            path.cubicTo(f8, f21, f19, f9, 0.0f, f9);
            float f22 = 0.0f - f10;
            float f23 = -f8;
            path.cubicTo(f22, f9, f23, f21, f23, 0.0f);
            path.cubicTo(f23, f20, f22, f18, 0.0f, f18);
        }
        PointF pointF2 = (PointF) this.f4350e.e();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.f4352g.a(path);
        this.f4353h = true;
        return path;
    }

    @Override // P0.d
    public final String getName() {
        return this.f4347b;
    }

    @Override // S0.f
    public final void h(S0.e eVar, int i4, ArrayList arrayList, S0.e eVar2) {
        Z0.g.g(eVar, i4, arrayList, eVar2, this);
    }
}
