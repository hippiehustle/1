package V0;

import N0.B;
import N0.C0202j;
import N0.x;
import O7.Y;
import Q0.p;
import Q0.r;
import U0.m;
import Z0.k;
import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import x.AbstractC1769h;

/* loaded from: classes.dex */
public final class j extends b {

    /* renamed from: D, reason: collision with root package name */
    public final StringBuilder f6291D;

    /* renamed from: E, reason: collision with root package name */
    public final RectF f6292E;

    /* renamed from: F, reason: collision with root package name */
    public final Matrix f6293F;

    /* renamed from: G, reason: collision with root package name */
    public final O0.a f6294G;

    /* renamed from: H, reason: collision with root package name */
    public final O0.a f6295H;

    /* renamed from: I, reason: collision with root package name */
    public final HashMap f6296I;

    /* renamed from: J, reason: collision with root package name */
    public final t.g f6297J;
    public final ArrayList K;

    /* renamed from: L, reason: collision with root package name */
    public final Q0.f f6298L;

    /* renamed from: M, reason: collision with root package name */
    public final x f6299M;

    /* renamed from: N, reason: collision with root package name */
    public final C0202j f6300N;

    /* renamed from: O, reason: collision with root package name */
    public final int f6301O;

    /* renamed from: P, reason: collision with root package name */
    public final Q0.f f6302P;

    /* renamed from: Q, reason: collision with root package name */
    public r f6303Q;

    /* renamed from: R, reason: collision with root package name */
    public final Q0.f f6304R;

    /* renamed from: S, reason: collision with root package name */
    public r f6305S;

    /* renamed from: T, reason: collision with root package name */
    public final Q0.i f6306T;

    /* renamed from: U, reason: collision with root package name */
    public r f6307U;

    /* renamed from: V, reason: collision with root package name */
    public final Q0.i f6308V;

    /* renamed from: W, reason: collision with root package name */
    public r f6309W;

    /* renamed from: X, reason: collision with root package name */
    public final Q0.f f6310X;
    public r Y;

    /* renamed from: Z, reason: collision with root package name */
    public r f6311Z;

    /* renamed from: a0, reason: collision with root package name */
    public final Q0.f f6312a0;

    /* renamed from: b0, reason: collision with root package name */
    public final Q0.f f6313b0;

    /* renamed from: c0, reason: collision with root package name */
    public final Q0.f f6314c0;

    public j(x xVar, e eVar) {
        super(xVar, eVar);
        Y y4;
        Y y5;
        T0.a aVar;
        Y y8;
        T0.a aVar2;
        Y y9;
        T0.a aVar3;
        A4.d dVar;
        T0.a aVar4;
        A4.d dVar2;
        T0.b bVar;
        A4.d dVar3;
        T0.b bVar2;
        A4.d dVar4;
        T0.a aVar5;
        A4.d dVar5;
        T0.a aVar6;
        this.f6291D = new StringBuilder(2);
        this.f6292E = new RectF();
        this.f6293F = new Matrix();
        O0.a aVar7 = new O0.a(1, 1);
        aVar7.setStyle(Paint.Style.FILL);
        this.f6294G = aVar7;
        O0.a aVar8 = new O0.a(1, 2);
        aVar8.setStyle(Paint.Style.STROKE);
        this.f6295H = aVar8;
        this.f6296I = new HashMap();
        this.f6297J = new t.g((Object) null);
        this.K = new ArrayList();
        this.f6301O = 2;
        this.f6299M = xVar;
        this.f6300N = eVar.f6257b;
        Q0.f fVar = new Q0.f(2, (List) eVar.f6270q.f1023e);
        this.f6298L = fVar;
        fVar.a(this);
        d(fVar);
        R3.r rVar = eVar.f6271r;
        if (rVar != null && (dVar5 = (A4.d) rVar.f5082e) != null && (aVar6 = (T0.a) dVar5.f295e) != null) {
            Q0.e r02 = aVar6.r0();
            this.f6302P = (Q0.f) r02;
            r02.a(this);
            d(r02);
        }
        if (rVar != null && (dVar4 = (A4.d) rVar.f5082e) != null && (aVar5 = (T0.a) dVar4.f296f) != null) {
            Q0.e r03 = aVar5.r0();
            this.f6304R = (Q0.f) r03;
            r03.a(this);
            d(r03);
        }
        if (rVar != null && (dVar3 = (A4.d) rVar.f5082e) != null && (bVar2 = (T0.b) dVar3.f297g) != null) {
            Q0.i r04 = bVar2.r0();
            this.f6306T = r04;
            r04.a(this);
            d(r04);
        }
        if (rVar != null && (dVar2 = (A4.d) rVar.f5082e) != null && (bVar = (T0.b) dVar2.f298h) != null) {
            Q0.i r05 = bVar.r0();
            this.f6308V = r05;
            r05.a(this);
            d(r05);
        }
        if (rVar != null && (dVar = (A4.d) rVar.f5082e) != null && (aVar4 = (T0.a) dVar.f299i) != null) {
            Q0.e r06 = aVar4.r0();
            this.f6310X = (Q0.f) r06;
            r06.a(this);
            d(r06);
        }
        if (rVar != null && (y9 = (Y) rVar.f5083f) != null && (aVar3 = (T0.a) y9.f4114b) != null) {
            Q0.e r07 = aVar3.r0();
            this.f6312a0 = (Q0.f) r07;
            r07.a(this);
            d(r07);
        }
        if (rVar != null && (y8 = (Y) rVar.f5083f) != null && (aVar2 = (T0.a) y8.f4115c) != null) {
            Q0.e r08 = aVar2.r0();
            this.f6313b0 = (Q0.f) r08;
            r08.a(this);
            d(r08);
        }
        if (rVar != null && (y5 = (Y) rVar.f5083f) != null && (aVar = (T0.a) y5.f4116d) != null) {
            Q0.e r09 = aVar.r0();
            this.f6314c0 = (Q0.f) r09;
            r09.a(this);
            d(r09);
        }
        if (rVar != null && (y4 = (Y) rVar.f5083f) != null) {
            this.f6301O = y4.f4113a;
        }
    }

    public static void t(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
                return;
            }
            canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
        }
    }

    public static void u(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
                return;
            }
            canvas.drawPath(path, paint);
        }
    }

    @Override // V0.b, P0.f
    public final void a(RectF rectF, Matrix matrix, boolean z8) {
        super.a(rectF, matrix, z8);
        C0202j c0202j = this.f6300N;
        rectF.set(0.0f, 0.0f, c0202j.k.width(), c0202j.k.height());
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [a1.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [S0.b, java.lang.Object] */
    @Override // V0.b, S0.f
    public final void e(R3.r rVar, Object obj) {
        super.e(rVar, obj);
        PointF pointF = B.f3540a;
        if (obj == 1) {
            r rVar2 = this.f6303Q;
            if (rVar2 != null) {
                o(rVar2);
            }
            r rVar3 = new r(rVar, null);
            this.f6303Q = rVar3;
            rVar3.a(this);
            d(this.f6303Q);
            return;
        }
        if (obj == 2) {
            r rVar4 = this.f6305S;
            if (rVar4 != null) {
                o(rVar4);
            }
            r rVar5 = new r(rVar, null);
            this.f6305S = rVar5;
            rVar5.a(this);
            d(this.f6305S);
            return;
        }
        if (obj == B.f3551n) {
            r rVar6 = this.f6307U;
            if (rVar6 != null) {
                o(rVar6);
            }
            r rVar7 = new r(rVar, null);
            this.f6307U = rVar7;
            rVar7.a(this);
            d(this.f6307U);
            return;
        }
        if (obj == B.f3552o) {
            r rVar8 = this.f6309W;
            if (rVar8 != null) {
                o(rVar8);
            }
            r rVar9 = new r(rVar, null);
            this.f6309W = rVar9;
            rVar9.a(this);
            d(this.f6309W);
            return;
        }
        if (obj == B.f3530A) {
            r rVar10 = this.Y;
            if (rVar10 != null) {
                o(rVar10);
            }
            r rVar11 = new r(rVar, null);
            this.Y = rVar11;
            rVar11.a(this);
            d(this.Y);
            return;
        }
        if (obj == B.f3537H) {
            r rVar12 = this.f6311Z;
            if (rVar12 != null) {
                o(rVar12);
            }
            r rVar13 = new r(rVar, null);
            this.f6311Z = rVar13;
            rVar13.a(this);
            d(this.f6311Z);
            return;
        }
        if (obj == B.f3539J) {
            Q0.f fVar = this.f6298L;
            fVar.getClass();
            fVar.j(new p(new Object(), rVar, new Object()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03f1  */
    @Override // V0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(Canvas canvas, Matrix matrix, int i4, Z0.a aVar) {
        x xVar;
        String str;
        Typeface typeface;
        int i8;
        float f8;
        float floatValue;
        int size;
        int i9;
        float f9;
        List list;
        int i10;
        float f10;
        List list2;
        int i11;
        String sb;
        Canvas canvas2;
        float f11;
        float floatValue2;
        int i12;
        float f12;
        List list3;
        String str2;
        int i13;
        int i14;
        int i15;
        x xVar2;
        List list4;
        O0.a aVar2;
        O0.a aVar3;
        O0.a aVar4;
        O0.a aVar5;
        S0.b bVar = (S0.b) this.f6298L.e();
        C0202j c0202j = this.f6300N;
        S0.c cVar = (S0.c) c0202j.f3606f.get(bVar.f5179b);
        if (cVar == null) {
            return;
        }
        String str3 = cVar.f5191c;
        String str4 = cVar.f5189a;
        canvas.save();
        canvas.concat(matrix);
        s(bVar, i4, 0);
        x xVar3 = this.f6299M;
        Map map = xVar3.f3681m;
        Q0.i iVar = this.f6308V;
        int i16 = 0;
        O0.a aVar6 = this.f6294G;
        O0.a aVar7 = this.f6295H;
        if (map == null && xVar3.f3674d.f3608h.e() > 0) {
            r rVar = this.Y;
            if (rVar != null) {
                f11 = ((Float) rVar.e()).floatValue();
            } else {
                f11 = bVar.f5180c;
            }
            float f13 = 0.0f;
            float[] fArr = (float[]) k.f7305e.get();
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f14 = k.f7306f;
            fArr[2] = f14;
            fArr[3] = f14;
            float f15 = f11 / 100.0f;
            matrix.mapPoints(fArr);
            O0.a aVar8 = aVar6;
            x xVar4 = xVar3;
            C0202j c0202j2 = c0202j;
            String str5 = str3;
            Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
            List asList = Arrays.asList(bVar.f5178a.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
            int size2 = asList.size();
            float f16 = bVar.f5182e / 10.0f;
            r rVar2 = this.f6309W;
            if (rVar2 != null) {
                floatValue2 = ((Float) rVar2.e()).floatValue();
            } else {
                if (iVar != null) {
                    floatValue2 = ((Float) iVar.e()).floatValue();
                }
                float f17 = f16;
                i12 = 0;
                int i17 = -1;
                while (i12 < size2) {
                    String str6 = (String) asList.get(i12);
                    PointF pointF = bVar.f5188m;
                    if (pointF == null) {
                        f12 = f13;
                    } else {
                        f12 = pointF.x;
                    }
                    float f18 = f15;
                    List y4 = y(str6, f12, cVar, f18, f17, true);
                    int i18 = i16;
                    while (i18 < y4.size()) {
                        i iVar2 = (i) y4.get(i18);
                        i17++;
                        canvas.save();
                        if (x(canvas, bVar, i17, iVar2.f6290b)) {
                            String str7 = iVar2.f6289a;
                            list3 = y4;
                            int i19 = i16;
                            while (i19 < str7.length()) {
                                List list5 = asList;
                                String str8 = str5;
                                int i20 = i18;
                                float f19 = f17;
                                C0202j c0202j3 = c0202j2;
                                S0.d dVar = (S0.d) c0202j3.f3608h.b(S0.d.a(str7.charAt(i19), str4, str8));
                                if (dVar == null) {
                                    c0202j2 = c0202j3;
                                    str2 = str7;
                                    i13 = size2;
                                    i14 = i12;
                                    i15 = i19;
                                    aVar2 = aVar7;
                                    xVar2 = xVar4;
                                    aVar3 = aVar8;
                                } else {
                                    s(bVar, i4, i19);
                                    HashMap hashMap = this.f6296I;
                                    if (hashMap.containsKey(dVar)) {
                                        list4 = (List) hashMap.get(dVar);
                                        str2 = str7;
                                        i13 = size2;
                                        i14 = i12;
                                        i15 = i19;
                                        xVar2 = xVar4;
                                    } else {
                                        str2 = str7;
                                        ArrayList arrayList = dVar.f5193a;
                                        i13 = size2;
                                        int size3 = arrayList.size();
                                        i14 = i12;
                                        ArrayList arrayList2 = new ArrayList(size3);
                                        i15 = i19;
                                        int i21 = i16;
                                        while (i21 < size3) {
                                            arrayList2.add(new P0.e(xVar4, this, (m) arrayList.get(i21), c0202j3));
                                            size3 = size3;
                                            i21++;
                                            arrayList = arrayList;
                                        }
                                        xVar2 = xVar4;
                                        hashMap.put(dVar, arrayList2);
                                        list4 = arrayList2;
                                    }
                                    int i22 = i16;
                                    while (i22 < list4.size()) {
                                        Path f20 = ((P0.e) list4.get(i22)).f();
                                        C0202j c0202j4 = c0202j3;
                                        f20.computeBounds(this.f6292E, i16);
                                        Matrix matrix2 = this.f6293F;
                                        matrix2.reset();
                                        List list6 = list4;
                                        matrix2.preTranslate(f13, (-bVar.f5184g) * k.c());
                                        matrix2.preScale(f18, f18);
                                        f20.transform(matrix2);
                                        if (bVar.k) {
                                            aVar5 = aVar8;
                                            u(f20, aVar5, canvas);
                                            aVar4 = aVar7;
                                            u(f20, aVar4, canvas);
                                        } else {
                                            aVar4 = aVar7;
                                            aVar5 = aVar8;
                                            u(f20, aVar4, canvas);
                                            u(f20, aVar5, canvas);
                                        }
                                        i22++;
                                        aVar7 = aVar4;
                                        aVar8 = aVar5;
                                        list4 = list6;
                                        c0202j3 = c0202j4;
                                        i16 = 0;
                                        f13 = 0.0f;
                                    }
                                    c0202j2 = c0202j3;
                                    aVar2 = aVar7;
                                    aVar3 = aVar8;
                                    canvas.translate((k.c() * ((float) dVar.f5195c) * f18) + f19, 0.0f);
                                }
                                f17 = f19;
                                aVar7 = aVar2;
                                str5 = str8;
                                aVar8 = aVar3;
                                xVar4 = xVar2;
                                i18 = i20;
                                asList = list5;
                                str7 = str2;
                                size2 = i13;
                                i12 = i14;
                                i16 = 0;
                                f13 = 0.0f;
                                i19 = i15 + 1;
                            }
                        } else {
                            list3 = y4;
                        }
                        int i23 = i18;
                        float f21 = f17;
                        List list7 = asList;
                        int i24 = size2;
                        int i25 = i12;
                        O0.a aVar9 = aVar7;
                        x xVar5 = xVar4;
                        O0.a aVar10 = aVar8;
                        String str9 = str5;
                        canvas.restore();
                        f17 = f21;
                        aVar7 = aVar9;
                        str5 = str9;
                        aVar8 = aVar10;
                        xVar4 = xVar5;
                        asList = list7;
                        size2 = i24;
                        i12 = i25;
                        i16 = 0;
                        f13 = 0.0f;
                        i18 = i23 + 1;
                        y4 = list3;
                    }
                    asList = asList;
                    i16 = 0;
                    f13 = 0.0f;
                    i12++;
                    f15 = f18;
                }
                canvas2 = canvas;
            }
            f16 += floatValue2;
            float f172 = f16;
            i12 = 0;
            int i172 = -1;
            while (i12 < size2) {
            }
            canvas2 = canvas;
        } else {
            r rVar3 = this.f6311Z;
            if (rVar3 != null && (typeface = (Typeface) rVar3.e()) != null) {
                str = "\n";
            } else {
                Map map2 = xVar3.f3681m;
                if (map2 != null) {
                    if (map2.containsKey(str4)) {
                        typeface = (Typeface) map2.get(str4);
                    } else {
                        String str10 = cVar.f5190b;
                        if (map2.containsKey(str10)) {
                            typeface = (Typeface) map2.get(str10);
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str4);
                            xVar = xVar3;
                            sb2.append("-");
                            sb2.append(str3);
                            String sb3 = sb2.toString();
                            if (map2.containsKey(sb3)) {
                                typeface = (Typeface) map2.get(sb3);
                            }
                        }
                    }
                    str = "\n";
                    if (typeface == null) {
                        typeface = cVar.f5192d;
                    }
                } else {
                    xVar = xVar3;
                }
                A4.d i26 = xVar.i();
                if (i26 == null) {
                    str = "\n";
                    typeface = null;
                } else {
                    J7.g gVar = (J7.g) i26.f295e;
                    gVar.f2521b = str4;
                    gVar.f2522c = str3;
                    HashMap hashMap2 = (HashMap) i26.f296f;
                    Typeface typeface2 = (Typeface) hashMap2.get(gVar);
                    if (typeface2 != null) {
                        typeface = typeface2;
                        str = "\n";
                    } else {
                        HashMap hashMap3 = (HashMap) i26.f297g;
                        Typeface typeface3 = (Typeface) hashMap3.get(str4);
                        if (typeface3 != null) {
                            typeface = typeface3;
                            str = "\n";
                        } else {
                            Typeface typeface4 = cVar.f5192d;
                            if (typeface4 != null) {
                                str = "\n";
                                typeface = typeface4;
                            } else {
                                str = "\n";
                                typeface = Typeface.createFromAsset((AssetManager) i26.f298h, "fonts/" + str4 + ((String) i26.f299i));
                                hashMap3.put(str4, typeface);
                            }
                        }
                        boolean contains = str3.contains("Italic");
                        boolean contains2 = str3.contains("Bold");
                        if (contains && contains2) {
                            i8 = 3;
                        } else if (contains) {
                            i8 = 2;
                        } else if (contains2) {
                            i8 = 1;
                        } else {
                            i8 = 0;
                        }
                        if (typeface.getStyle() != i8) {
                            typeface = Typeface.create(typeface, i8);
                        }
                        hashMap2.put(gVar, typeface);
                    }
                }
                if (typeface == null) {
                }
            }
            if (typeface != null) {
                String str11 = bVar.f5178a;
                aVar6.setTypeface(typeface);
                r rVar4 = this.Y;
                if (rVar4 != null) {
                    f8 = ((Float) rVar4.e()).floatValue();
                } else {
                    f8 = bVar.f5180c;
                }
                aVar6.setTextSize(k.c() * f8);
                aVar7.setTypeface(aVar6.getTypeface());
                aVar7.setTextSize(aVar6.getTextSize());
                float f22 = bVar.f5182e / 10.0f;
                r rVar5 = this.f6309W;
                if (rVar5 != null) {
                    floatValue = ((Float) rVar5.e()).floatValue();
                } else {
                    if (iVar != null) {
                        floatValue = ((Float) iVar.e()).floatValue();
                    }
                    float c6 = ((k.c() * f22) * f8) / 100.0f;
                    List asList2 = Arrays.asList(str11.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll(str, "\r").split("\r"));
                    size = asList2.size();
                    i9 = 0;
                    int i27 = 0;
                    int i28 = -1;
                    while (i9 < size) {
                        String str12 = (String) asList2.get(i9);
                        PointF pointF2 = bVar.f5188m;
                        if (pointF2 == null) {
                            f9 = 0.0f;
                        } else {
                            f9 = pointF2.x;
                        }
                        float f23 = c6;
                        List y5 = y(str12, f9, cVar, 0.0f, f23, false);
                        int i29 = 0;
                        while (i29 < y5.size()) {
                            i iVar3 = (i) y5.get(i29);
                            i28++;
                            canvas.save();
                            if (x(canvas, bVar, i28, aVar6.measureText(iVar3.f6289a))) {
                                String str13 = iVar3.f6289a;
                                list = y5;
                                i10 = i29;
                                int i30 = 0;
                                while (i30 < str13.length()) {
                                    int codePointAt = str13.codePointAt(i30);
                                    int i31 = i30;
                                    int charCount = Character.charCount(codePointAt) + i30;
                                    S0.c cVar2 = cVar;
                                    while (true) {
                                        if (charCount < str13.length()) {
                                            int codePointAt2 = str13.codePointAt(charCount);
                                            f10 = f23;
                                            if (Character.getType(codePointAt2) != 16 && Character.getType(codePointAt2) != 27 && Character.getType(codePointAt2) != 6 && Character.getType(codePointAt2) != 28 && Character.getType(codePointAt2) != 8 && Character.getType(codePointAt2) != 19) {
                                                break;
                                            }
                                            charCount += Character.charCount(codePointAt2);
                                            codePointAt = (codePointAt * 31) + codePointAt2;
                                            f23 = f10;
                                        } else {
                                            f10 = f23;
                                            break;
                                        }
                                    }
                                    long j = codePointAt;
                                    t.g gVar2 = this.f6297J;
                                    if (gVar2.b(j)) {
                                        sb = (String) gVar2.c(j);
                                        list2 = asList2;
                                        i11 = size;
                                    } else {
                                        list2 = asList2;
                                        StringBuilder sb4 = this.f6291D;
                                        i11 = size;
                                        sb4.setLength(0);
                                        int i32 = i31;
                                        while (i32 < charCount) {
                                            int i33 = charCount;
                                            int codePointAt3 = str13.codePointAt(i32);
                                            sb4.appendCodePoint(codePointAt3);
                                            i32 += Character.charCount(codePointAt3);
                                            charCount = i33;
                                        }
                                        sb = sb4.toString();
                                        gVar2.g(j, sb);
                                    }
                                    s(bVar, i4, i27 + i31);
                                    if (bVar.k) {
                                        t(sb, aVar6, canvas);
                                        t(sb, aVar7, canvas);
                                    } else {
                                        t(sb, aVar7, canvas);
                                        t(sb, aVar6, canvas);
                                    }
                                    canvas.translate(aVar6.measureText(sb) + f10, 0.0f);
                                    i30 = sb.length() + i31;
                                    cVar = cVar2;
                                    asList2 = list2;
                                    f23 = f10;
                                    size = i11;
                                }
                            } else {
                                list = y5;
                                i10 = i29;
                            }
                            S0.c cVar3 = cVar;
                            float f24 = f23;
                            List list8 = asList2;
                            int i34 = size;
                            i27 += iVar3.f6289a.length();
                            canvas.restore();
                            i29 = i10 + 1;
                            y5 = list;
                            cVar = cVar3;
                            asList2 = list8;
                            f23 = f24;
                            size = i34;
                        }
                        i9++;
                        cVar = cVar;
                        c6 = f23;
                    }
                }
                f22 += floatValue;
                float c62 = ((k.c() * f22) * f8) / 100.0f;
                List asList22 = Arrays.asList(str11.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll(str, "\r").split("\r"));
                size = asList22.size();
                i9 = 0;
                int i272 = 0;
                int i282 = -1;
                while (i9 < size) {
                }
            }
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    public final void s(S0.b bVar, int i4, int i8) {
        int intValue;
        r rVar = this.f6303Q;
        O0.a aVar = this.f6294G;
        if (rVar != null) {
            aVar.setColor(((Integer) rVar.e()).intValue());
        } else {
            Q0.f fVar = this.f6302P;
            if (fVar != null && w(i8)) {
                aVar.setColor(((Integer) fVar.e()).intValue());
            } else {
                aVar.setColor(bVar.f5185h);
            }
        }
        r rVar2 = this.f6305S;
        O0.a aVar2 = this.f6295H;
        if (rVar2 != null) {
            aVar2.setColor(((Integer) rVar2.e()).intValue());
        } else {
            Q0.f fVar2 = this.f6304R;
            if (fVar2 != null && w(i8)) {
                aVar2.setColor(((Integer) fVar2.e()).intValue());
            } else {
                aVar2.setColor(bVar.f5186i);
            }
        }
        Q0.e eVar = this.f6234w.j;
        int i9 = 100;
        if (eVar == null) {
            intValue = 100;
        } else {
            intValue = ((Integer) eVar.e()).intValue();
        }
        Q0.f fVar3 = this.f6310X;
        if (fVar3 != null && w(i8)) {
            i9 = ((Integer) fVar3.e()).intValue();
        }
        int round = Math.round((((i9 / 100.0f) * ((intValue * 255.0f) / 100.0f)) * i4) / 255.0f);
        aVar.setAlpha(round);
        aVar2.setAlpha(round);
        r rVar3 = this.f6307U;
        if (rVar3 != null) {
            aVar2.setStrokeWidth(((Float) rVar3.e()).floatValue());
            return;
        }
        Q0.i iVar = this.f6306T;
        if (iVar != null && w(i8)) {
            aVar2.setStrokeWidth(((Float) iVar.e()).floatValue());
        } else {
            aVar2.setStrokeWidth(k.c() * bVar.j);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [V0.i, java.lang.Object] */
    public final i v(int i4) {
        ArrayList arrayList = this.K;
        for (int size = arrayList.size(); size < i4; size++) {
            ?? obj = new Object();
            obj.f6289a = "";
            obj.f6290b = 0.0f;
            arrayList.add(obj);
        }
        return (i) arrayList.get(i4 - 1);
    }

    public final boolean w(int i4) {
        Q0.f fVar;
        int length = ((S0.b) this.f6298L.e()).f5178a.length();
        Q0.f fVar2 = this.f6312a0;
        if (fVar2 != null && (fVar = this.f6313b0) != null) {
            int min = Math.min(((Integer) fVar2.e()).intValue(), ((Integer) fVar.e()).intValue());
            int max = Math.max(((Integer) fVar2.e()).intValue(), ((Integer) fVar.e()).intValue());
            Q0.f fVar3 = this.f6314c0;
            if (fVar3 != null) {
                int intValue = ((Integer) fVar3.e()).intValue();
                min += intValue;
                max += intValue;
            }
            if (this.f6301O == 2) {
                if (i4 < min || i4 >= max) {
                    return false;
                }
                return true;
            }
            float f8 = (i4 / length) * 100.0f;
            if (f8 < min || f8 >= max) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean x(Canvas canvas, S0.b bVar, int i4, float f8) {
        float f9;
        float f10;
        PointF pointF = bVar.f5187l;
        PointF pointF2 = bVar.f5188m;
        float c6 = k.c();
        float f11 = 0.0f;
        if (pointF == null) {
            f9 = 0.0f;
        } else {
            f9 = (bVar.f5183f * c6) + pointF.y;
        }
        float f12 = (i4 * bVar.f5183f * c6) + f9;
        if (this.f6299M.f3692x && pointF2 != null && pointF != null && f12 >= pointF.y + pointF2.y + bVar.f5180c) {
            return false;
        }
        if (pointF == null) {
            f10 = 0.0f;
        } else {
            f10 = pointF.x;
        }
        if (pointF2 != null) {
            f11 = pointF2.x;
        }
        int b4 = AbstractC1769h.b(bVar.f5181d);
        if (b4 != 0) {
            if (b4 != 1) {
                if (b4 != 2) {
                    return true;
                }
                canvas.translate(((f11 / 2.0f) + f10) - (f8 / 2.0f), f12);
                return true;
            }
            canvas.translate((f10 + f11) - f8, f12);
            return true;
        }
        canvas.translate(f10, f12);
        return true;
    }

    public final List y(String str, float f8, S0.c cVar, float f9, float f10, boolean z8) {
        float measureText;
        int i4 = 0;
        int i8 = 0;
        boolean z9 = false;
        int i9 = 0;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (z8) {
                S0.d dVar = (S0.d) this.f6300N.f3608h.b(S0.d.a(charAt, cVar.f5189a, cVar.f5191c));
                if (dVar != null) {
                    measureText = (k.c() * ((float) dVar.f5195c) * f9) + f10;
                }
            } else {
                measureText = this.f6294G.measureText(str.substring(i10, i10 + 1)) + f10;
            }
            if (charAt == ' ') {
                z9 = true;
                f13 = measureText;
            } else if (z9) {
                z9 = false;
                i9 = i10;
                f12 = measureText;
            } else {
                f12 += measureText;
            }
            f11 += measureText;
            if (f8 > 0.0f && f11 >= f8 && charAt != ' ') {
                i4++;
                i v8 = v(i4);
                if (i9 == i8) {
                    v8.f6289a = str.substring(i8, i10).trim();
                    v8.f6290b = (f11 - measureText) - ((r10.length() - r8.length()) * f13);
                    i8 = i10;
                    i9 = i8;
                    f11 = measureText;
                    f12 = f11;
                } else {
                    v8.f6289a = str.substring(i8, i9 - 1).trim();
                    v8.f6290b = ((f11 - f12) - ((r8.length() - r14.length()) * f13)) - f13;
                    f11 = f12;
                    i8 = i9;
                }
            }
        }
        if (f11 > 0.0f) {
            i4++;
            i v9 = v(i4);
            v9.f6289a = str.substring(i8);
            v9.f6290b = f11;
        }
        return this.K.subList(0, i4);
    }
}
