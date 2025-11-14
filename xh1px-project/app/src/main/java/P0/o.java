package P0;

import N0.B;
import N0.x;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import n1.AbstractC1149a;
import x.AbstractC1769h;

/* loaded from: classes.dex */
public final class o implements n, Q0.a, l {

    /* renamed from: e, reason: collision with root package name */
    public final String f4402e;

    /* renamed from: f, reason: collision with root package name */
    public final x f4403f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4404g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f4405h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f4406i;
    public final Q0.i j;
    public final Q0.e k;

    /* renamed from: l, reason: collision with root package name */
    public final Q0.i f4407l;

    /* renamed from: m, reason: collision with root package name */
    public final Q0.i f4408m;

    /* renamed from: n, reason: collision with root package name */
    public final Q0.i f4409n;

    /* renamed from: o, reason: collision with root package name */
    public final Q0.i f4410o;

    /* renamed from: p, reason: collision with root package name */
    public final Q0.i f4411p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4413r;

    /* renamed from: a, reason: collision with root package name */
    public final Path f4398a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Path f4399b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final PathMeasure f4400c = new PathMeasure();

    /* renamed from: d, reason: collision with root package name */
    public final float[] f4401d = new float[2];

    /* renamed from: q, reason: collision with root package name */
    public final c f4412q = new c();

    public o(x xVar, V0.b bVar, U0.h hVar) {
        this.f4403f = xVar;
        this.f4402e = hVar.f5970a;
        int i4 = hVar.f5971b;
        this.f4404g = i4;
        this.f4405h = hVar.j;
        this.f4406i = hVar.k;
        Q0.i r02 = hVar.f5972c.r0();
        this.j = r02;
        Q0.e r03 = hVar.f5973d.r0();
        this.k = r03;
        Q0.i r04 = hVar.f5974e.r0();
        this.f4407l = r04;
        Q0.i r05 = hVar.f5976g.r0();
        this.f4409n = r05;
        Q0.i r06 = hVar.f5978i.r0();
        this.f4411p = r06;
        if (i4 == 1) {
            this.f4408m = hVar.f5975f.r0();
            this.f4410o = hVar.f5977h.r0();
        } else {
            this.f4408m = null;
            this.f4410o = null;
        }
        bVar.d(r02);
        bVar.d(r03);
        bVar.d(r04);
        bVar.d(r05);
        bVar.d(r06);
        if (i4 == 1) {
            bVar.d(this.f4408m);
            bVar.d(this.f4410o);
        }
        r02.a(this);
        r03.a(this);
        r04.a(this);
        r05.a(this);
        r06.a(this);
        if (i4 == 1) {
            this.f4408m.a(this);
            this.f4410o.a(this);
        }
    }

    @Override // Q0.a
    public final void b() {
        this.f4413r = false;
        this.f4403f.invalidateSelf();
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
                        this.f4412q.f4335d.add(uVar);
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
        Q0.i iVar;
        Q0.i iVar2;
        if (obj == B.f3555r) {
            this.j.j(rVar);
            return;
        }
        if (obj == B.f3556s) {
            this.f4407l.j(rVar);
            return;
        }
        if (obj == B.f3548i) {
            this.k.j(rVar);
            return;
        }
        if (obj == B.f3557t && (iVar2 = this.f4408m) != null) {
            iVar2.j(rVar);
            return;
        }
        if (obj == B.f3558u) {
            this.f4409n.j(rVar);
            return;
        }
        if (obj == B.f3559v && (iVar = this.f4410o) != null) {
            iVar.j(rVar);
        } else if (obj == B.f3560w) {
            this.f4411p.j(rVar);
        }
    }

    @Override // P0.n
    public final Path f() {
        boolean z8;
        float f8;
        float f9;
        float f10;
        double d2;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        int i4;
        double d3;
        boolean z9 = this.f4413r;
        Path path = this.f4398a;
        if (z9) {
            return path;
        }
        path.reset();
        if (this.f4405h) {
            this.f4413r = true;
            return path;
        }
        int b4 = AbstractC1769h.b(this.f4404g);
        Q0.e eVar = this.k;
        Q0.i iVar = this.f4409n;
        Q0.i iVar2 = this.f4411p;
        double d9 = 0.0d;
        Q0.i iVar3 = this.f4407l;
        Q0.i iVar4 = this.j;
        if (b4 != 0) {
            if (b4 != 1) {
                z8 = true;
            } else {
                int floor = (int) Math.floor(((Float) iVar4.e()).floatValue());
                if (iVar3 != null) {
                    d9 = ((Float) iVar3.e()).floatValue();
                }
                double radians = Math.toRadians(d9 - 90.0d);
                double d10 = floor;
                float floatValue = ((Float) iVar2.e()).floatValue() / 100.0f;
                float floatValue2 = ((Float) iVar.e()).floatValue();
                double d11 = floatValue2;
                z8 = true;
                float cos = (float) (Math.cos(radians) * d11);
                float sin = (float) (Math.sin(radians) * d11);
                path.moveTo(cos, sin);
                double d12 = (float) (6.283185307179586d / d10);
                double ceil = Math.ceil(d10);
                double d13 = radians + d12;
                int i8 = 0;
                while (true) {
                    double d14 = i8;
                    if (d14 >= ceil) {
                        break;
                    }
                    double d15 = ceil;
                    float cos2 = (float) (Math.cos(d13) * d11);
                    float sin2 = (float) (Math.sin(d13) * d11);
                    if (floatValue != 0.0f) {
                        i4 = i8;
                        Path path2 = path;
                        d3 = d11;
                        double atan2 = (float) (Math.atan2(sin, cos) - 1.5707963267948966d);
                        float cos3 = (float) Math.cos(atan2);
                        float sin3 = (float) Math.sin(atan2);
                        double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                        float f22 = floatValue2 * floatValue * 0.25f;
                        float f23 = f22 * cos3;
                        float f24 = f22 * sin3;
                        float cos4 = ((float) Math.cos(atan22)) * f22;
                        float sin4 = f22 * ((float) Math.sin(atan22));
                        if (d14 == d15 - 1.0d) {
                            Path path3 = this.f4399b;
                            path3.reset();
                            path3.moveTo(cos, sin);
                            float f25 = cos - f23;
                            float f26 = sin - f24;
                            float f27 = cos2 + cos4;
                            float f28 = sin2 + sin4;
                            path3.cubicTo(f25, f26, f27, f28, cos2, sin2);
                            PathMeasure pathMeasure = this.f4400c;
                            pathMeasure.setPath(path3, false);
                            float length = pathMeasure.getLength() * 0.9999f;
                            float[] fArr = this.f4401d;
                            pathMeasure.getPosTan(length, fArr, null);
                            path = path2;
                            path.cubicTo(f25, f26, f27, f28, fArr[0], fArr[1]);
                            cos = cos2;
                            sin = sin2;
                        } else {
                            float f29 = sin2 + sin4;
                            path = path2;
                            sin = sin2;
                            path.cubicTo(cos - f23, sin - f24, cos2 + cos4, f29, cos2, sin);
                            cos = cos2;
                        }
                    } else {
                        i4 = i8;
                        d3 = d11;
                        cos = cos2;
                        sin = sin2;
                        if (d14 != d15 - 1.0d) {
                            path.lineTo(cos, sin);
                        } else {
                            i8 = i4 + 1;
                            ceil = d15;
                            d11 = d3;
                        }
                    }
                    d13 += d12;
                    i8 = i4 + 1;
                    ceil = d15;
                    d11 = d3;
                }
                PointF pointF = (PointF) eVar.e();
                path.offset(pointF.x, pointF.y);
                path.close();
            }
        } else {
            z8 = true;
            float floatValue3 = ((Float) iVar4.e()).floatValue();
            if (iVar3 != null) {
                d9 = ((Float) iVar3.e()).floatValue();
            }
            double radians2 = Math.toRadians(d9 - 90.0d);
            double d16 = floatValue3;
            float f30 = (float) (6.283185307179586d / d16);
            if (this.f4406i) {
                f30 *= -1.0f;
            }
            float f31 = f30;
            float f32 = f31 / 2.0f;
            float f33 = floatValue3 - ((int) floatValue3);
            if (f33 != 0.0f) {
                f8 = 2.0f;
                radians2 += (1.0f - f33) * f32;
            } else {
                f8 = 2.0f;
            }
            float floatValue4 = ((Float) iVar.e()).floatValue();
            float floatValue5 = ((Float) this.f4408m.e()).floatValue();
            Q0.i iVar5 = this.f4410o;
            if (iVar5 != null) {
                f9 = ((Float) iVar5.e()).floatValue() / 100.0f;
            } else {
                f9 = 0.0f;
            }
            if (iVar2 != null) {
                f10 = ((Float) iVar2.e()).floatValue() / 100.0f;
            } else {
                f10 = 0.0f;
            }
            if (f33 != 0.0f) {
                float a3 = AbstractC1149a.a(floatValue4, floatValue5, f33, floatValue5);
                double d17 = a3;
                f13 = a3;
                float cos5 = (float) (Math.cos(radians2) * d17);
                float sin5 = (float) (Math.sin(radians2) * d17);
                path.moveTo(cos5, sin5);
                d2 = radians2 + ((f31 * f33) / f8);
                f11 = cos5;
                f12 = sin5;
            } else {
                double d18 = floatValue4;
                float cos6 = (float) (Math.cos(radians2) * d18);
                float sin6 = (float) (Math.sin(radians2) * d18);
                path.moveTo(cos6, sin6);
                d2 = radians2 + f32;
                f11 = cos6;
                f12 = sin6;
                f13 = 0.0f;
            }
            double ceil2 = Math.ceil(d16) * 2.0d;
            double d19 = d2;
            int i9 = 0;
            boolean z10 = false;
            while (true) {
                double d20 = i9;
                if (d20 >= ceil2) {
                    break;
                }
                if (z10) {
                    f14 = floatValue4;
                } else {
                    f14 = floatValue5;
                }
                if (f13 != 0.0f && d20 == ceil2 - 2.0d) {
                    f15 = (f31 * f33) / f8;
                } else {
                    f15 = f32;
                }
                if (f13 != 0.0f && d20 == ceil2 - 1.0d) {
                    f14 = f13;
                }
                double d21 = f14;
                float cos7 = (float) (Math.cos(d19) * d21);
                float sin7 = (float) (Math.sin(d19) * d21);
                if (f9 == 0.0f && f10 == 0.0f) {
                    path.lineTo(cos7, sin7);
                    f16 = f33;
                    f21 = cos7;
                } else {
                    f16 = f33;
                    Path path4 = path;
                    double atan23 = (float) (Math.atan2(f12, f11) - 1.5707963267948966d);
                    float cos8 = (float) Math.cos(atan23);
                    float sin8 = (float) Math.sin(atan23);
                    float f34 = f11;
                    float f35 = f12;
                    double atan24 = (float) (Math.atan2(sin7, cos7) - 1.5707963267948966d);
                    float cos9 = (float) Math.cos(atan24);
                    float sin9 = (float) Math.sin(atan24);
                    if (z10) {
                        f17 = f9;
                    } else {
                        f17 = f10;
                    }
                    if (z10) {
                        f18 = f10;
                    } else {
                        f18 = f9;
                    }
                    if (z10) {
                        f19 = floatValue5;
                    } else {
                        f19 = floatValue4;
                    }
                    if (z10) {
                        f20 = floatValue4;
                    } else {
                        f20 = floatValue5;
                    }
                    float f36 = f19 * f17 * 0.47829f;
                    float f37 = cos8 * f36;
                    float f38 = f36 * sin8;
                    float f39 = f20 * f18 * 0.47829f;
                    float f40 = cos9 * f39;
                    float f41 = f39 * sin9;
                    if (f33 != 0.0f) {
                        if (i9 == 0) {
                            f37 *= f16;
                            f38 *= f16;
                        } else if (d20 == ceil2 - 1.0d) {
                            f40 *= f16;
                            f41 *= f16;
                        }
                    }
                    f21 = cos7;
                    path = path4;
                    path.cubicTo(f34 - f37, f35 - f38, f40 + cos7, sin7 + f41, f21, sin7);
                }
                d19 += f15;
                z10 = !z10;
                i9++;
                f11 = f21;
                f12 = sin7;
                f33 = f16;
                f8 = 2.0f;
            }
            PointF pointF2 = (PointF) eVar.e();
            path.offset(pointF2.x, pointF2.y);
            path.close();
        }
        path.close();
        this.f4412q.a(path);
        this.f4413r = z8;
        return path;
    }

    @Override // P0.d
    public final String getName() {
        return this.f4402e;
    }

    @Override // S0.f
    public final void h(S0.e eVar, int i4, ArrayList arrayList, S0.e eVar2) {
        Z0.g.g(eVar, i4, arrayList, eVar2, this);
    }
}
