package H;

import android.graphics.Path;
import android.util.Log;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public char f1853a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f1854b;

    public e(char c6, float[] fArr) {
        this.f1853a = c6;
        this.f1854b = fArr;
    }

    public static void a(Path path, float f8, float f9, float f10, float f11, float f12, float f13, float f14, boolean z8, boolean z9) {
        double d2;
        double d3;
        boolean z10;
        double radians = Math.toRadians(f14);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d9 = f8;
        double d10 = f9;
        double d11 = f12;
        double d12 = ((d10 * sin) + (d9 * cos)) / d11;
        double d13 = f13;
        double d14 = ((d10 * cos) + ((-f8) * sin)) / d13;
        double d15 = f11;
        double d16 = ((d15 * sin) + (f10 * cos)) / d11;
        double d17 = ((d15 * cos) + ((-f10) * sin)) / d13;
        double d18 = d12 - d16;
        double d19 = d14 - d17;
        double d20 = (d12 + d16) / 2.0d;
        double d21 = (d14 + d17) / 2.0d;
        double d22 = (d19 * d19) + (d18 * d18);
        if (d22 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d23 = (1.0d / d22) - 0.25d;
        if (d23 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d22);
            float sqrt = (float) (Math.sqrt(d22) / 1.99999d);
            a(path, f8, f9, f10, f11, f12 * sqrt, sqrt * f13, f14, z8, z9);
            return;
        }
        double sqrt2 = Math.sqrt(d23);
        double d24 = sqrt2 * d18;
        double d25 = sqrt2 * d19;
        if (z8 == z9) {
            d2 = d20 - d25;
            d3 = d21 + d24;
        } else {
            d2 = d20 + d25;
            d3 = d21 - d24;
        }
        double atan2 = Math.atan2(d14 - d3, d12 - d2);
        double atan22 = Math.atan2(d17 - d3, d16 - d2) - atan2;
        if (atan22 >= 0.0d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 != z10) {
            if (atan22 > 0.0d) {
                atan22 -= 6.283185307179586d;
            } else {
                atan22 += 6.283185307179586d;
            }
        }
        double d26 = d2 * d11;
        double d27 = d3 * d13;
        double d28 = (d26 * cos) - (d27 * sin);
        double d29 = (d27 * cos) + (d26 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(radians);
        double sin2 = Math.sin(radians);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d30 = -d11;
        double d31 = d30 * cos2;
        double d32 = d13 * sin2;
        double d33 = (d31 * sin3) - (d32 * cos3);
        double d34 = d30 * sin2;
        double d35 = d13 * cos2;
        double d36 = atan22 / ceil;
        double d37 = (cos3 * d35) + (sin3 * d34);
        double d38 = d9;
        double d39 = d10;
        int i4 = 0;
        double d40 = atan2;
        while (i4 < ceil) {
            double d41 = d40 + d36;
            double sin4 = Math.sin(d41);
            double cos4 = Math.cos(d41);
            int i8 = ceil;
            double d42 = (((d11 * cos2) * cos4) + d28) - (d32 * sin4);
            double d43 = (d35 * sin4) + (d11 * sin2 * cos4) + d29;
            double d44 = (d31 * sin4) - (d32 * cos4);
            double d45 = (cos4 * d35) + (sin4 * d34);
            double d46 = d41 - d40;
            double tan = Math.tan(d46 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d46)) / 3.0d;
            double d47 = (d37 * sqrt3) + d39;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d33 * sqrt3) + d38), (float) d47, (float) (d42 - (sqrt3 * d44)), (float) (d43 - (sqrt3 * d45)), (float) d42, (float) d43);
            i4++;
            d39 = d43;
            cos2 = cos2;
            d34 = d34;
            d40 = d41;
            d37 = d45;
            d38 = d42;
            ceil = i8;
            d33 = d44;
            d36 = d36;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(e[] eVarArr, Path path) {
        int i4;
        float[] fArr;
        int i8;
        e eVar;
        int i9;
        char c6;
        boolean z8;
        boolean z9;
        float f8;
        float f9;
        e eVar2;
        boolean z10;
        boolean z11;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        e[] eVarArr2 = eVarArr;
        Path path2 = path;
        float[] fArr2 = new float[6];
        int length = eVarArr2.length;
        int i10 = 0;
        int i11 = 0;
        char c9 = 'm';
        while (i11 < length) {
            e eVar3 = eVarArr2[i11];
            char c10 = eVar3.f1853a;
            float[] fArr3 = eVar3.f1854b;
            float f18 = fArr2[i10];
            float f19 = fArr2[1];
            float f20 = fArr2[2];
            float f21 = fArr2[3];
            float f22 = fArr2[4];
            int i12 = i10;
            float f23 = fArr2[5];
            switch (c10) {
                case 'A':
                case 'a':
                    i4 = 7;
                    break;
                case 'C':
                case 'c':
                    i4 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i4 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i4 = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f22, f23);
                    f18 = f22;
                    f20 = f18;
                    f19 = f23;
                    f21 = f19;
                    break;
            }
            i4 = 2;
            float f24 = f22;
            float f25 = f23;
            float f26 = f18;
            float f27 = f19;
            int i13 = i12;
            while (i13 < fArr3.length) {
                if (c10 != 'A') {
                    if (c10 != 'C') {
                        if (c10 != 'H') {
                            if (c10 != 'Q') {
                                if (c10 != 'V') {
                                    if (c10 != 'a') {
                                        if (c10 != 'c') {
                                            if (c10 != 'h') {
                                                if (c10 != 'q') {
                                                    if (c10 != 'v') {
                                                        if (c10 != 'L') {
                                                            if (c10 != 'M') {
                                                                if (c10 != 'S') {
                                                                    if (c10 != 'T') {
                                                                        if (c10 != 'l') {
                                                                            if (c10 != 'm') {
                                                                                if (c10 != 's') {
                                                                                    if (c10 != 't') {
                                                                                        fArr = fArr3;
                                                                                        i8 = i13;
                                                                                        eVar = eVar3;
                                                                                        f9 = f26;
                                                                                    } else {
                                                                                        if (c9 != 'q' && c9 != 't' && c9 != 'Q' && c9 != 'T') {
                                                                                            f17 = 0.0f;
                                                                                            f16 = 0.0f;
                                                                                        } else {
                                                                                            f16 = f26 - f20;
                                                                                            f17 = f27 - f21;
                                                                                        }
                                                                                        int i14 = i13 + 1;
                                                                                        path2.rQuadTo(f16, f17, fArr3[i13], fArr3[i14]);
                                                                                        float f28 = f16 + f26;
                                                                                        float f29 = f17 + f27;
                                                                                        float f30 = f26 + fArr3[i13];
                                                                                        f27 += fArr3[i14];
                                                                                        f21 = f29;
                                                                                        fArr = fArr3;
                                                                                        i8 = i13;
                                                                                        eVar = eVar3;
                                                                                        f9 = f30;
                                                                                        f20 = f28;
                                                                                    }
                                                                                    f8 = f27;
                                                                                } else {
                                                                                    if (c9 != 'c' && c9 != 's' && c9 != 'C' && c9 != 'S') {
                                                                                        f15 = 0.0f;
                                                                                        f14 = 0.0f;
                                                                                    } else {
                                                                                        f14 = f27 - f21;
                                                                                        f15 = f26 - f20;
                                                                                    }
                                                                                    int i15 = i13;
                                                                                    int i16 = i15 + 1;
                                                                                    int i17 = i15 + 2;
                                                                                    int i18 = i15 + 3;
                                                                                    fArr = fArr3;
                                                                                    i8 = i15;
                                                                                    path2.rCubicTo(f15, f14, fArr3[i15], fArr3[i16], fArr3[i17], fArr3[i18]);
                                                                                    f10 = fArr[i8] + f26;
                                                                                    f11 = fArr[i16] + f27;
                                                                                    f26 += fArr[i17];
                                                                                    f12 = fArr[i18];
                                                                                }
                                                                            } else {
                                                                                fArr = fArr3;
                                                                                i8 = i13;
                                                                                float f31 = fArr[i8];
                                                                                f26 += f31;
                                                                                float f32 = fArr[i8 + 1];
                                                                                f27 += f32;
                                                                                if (i8 > 0) {
                                                                                    path2.rLineTo(f31, f32);
                                                                                } else {
                                                                                    path2.rMoveTo(f31, f32);
                                                                                    eVar = eVar3;
                                                                                    f9 = f26;
                                                                                    f24 = f9;
                                                                                    f8 = f27;
                                                                                    f25 = f8;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            fArr = fArr3;
                                                                            i8 = i13;
                                                                            int i19 = i8 + 1;
                                                                            path2.rLineTo(fArr[i8], fArr[i19]);
                                                                            f26 += fArr[i8];
                                                                            f13 = fArr[i19];
                                                                        }
                                                                    } else {
                                                                        fArr = fArr3;
                                                                        i8 = i13;
                                                                        if (c9 == 'q' || c9 == 't' || c9 == 'Q' || c9 == 'T') {
                                                                            f26 = (f26 * 2.0f) - f20;
                                                                            f27 = (f27 * 2.0f) - f21;
                                                                        }
                                                                        int i20 = i8 + 1;
                                                                        path2.quadTo(f26, f27, fArr[i8], fArr[i20]);
                                                                        f9 = fArr[i8];
                                                                        f8 = fArr[i20];
                                                                        eVar = eVar3;
                                                                        f20 = f26;
                                                                        f21 = f27;
                                                                    }
                                                                    i9 = i11;
                                                                    c6 = c10;
                                                                } else {
                                                                    fArr = fArr3;
                                                                    i8 = i13;
                                                                    if (c9 == 'c' || c9 == 's' || c9 == 'C' || c9 == 'S') {
                                                                        f26 = (f26 * 2.0f) - f20;
                                                                        f27 = (f27 * 2.0f) - f21;
                                                                    }
                                                                    float f33 = f26;
                                                                    float f34 = f27;
                                                                    int i21 = i8 + 1;
                                                                    int i22 = i8 + 2;
                                                                    int i23 = i8 + 3;
                                                                    path2.cubicTo(f33, f34, fArr[i8], fArr[i21], fArr[i22], fArr[i23]);
                                                                    float f35 = fArr[i8];
                                                                    f20 = f35;
                                                                    f21 = fArr[i21];
                                                                    f9 = fArr[i22];
                                                                    f8 = fArr[i23];
                                                                }
                                                            } else {
                                                                fArr = fArr3;
                                                                i8 = i13;
                                                                f9 = fArr[i8];
                                                                f8 = fArr[i8 + 1];
                                                                if (i8 > 0) {
                                                                    path2.lineTo(f9, f8);
                                                                } else {
                                                                    path2.moveTo(f9, f8);
                                                                    f24 = f9;
                                                                    f25 = f8;
                                                                }
                                                            }
                                                        } else {
                                                            fArr = fArr3;
                                                            i8 = i13;
                                                            int i24 = i8 + 1;
                                                            path2.lineTo(fArr[i8], fArr[i24]);
                                                            f9 = fArr[i8];
                                                            f8 = fArr[i24];
                                                        }
                                                        i9 = i11;
                                                        eVar = eVar3;
                                                        c6 = c10;
                                                    } else {
                                                        fArr = fArr3;
                                                        i8 = i13;
                                                        path2.rLineTo(0.0f, fArr[i8]);
                                                        f13 = fArr[i8];
                                                    }
                                                    f27 += f13;
                                                } else {
                                                    fArr = fArr3;
                                                    i8 = i13;
                                                    int i25 = i8 + 1;
                                                    int i26 = i8 + 2;
                                                    int i27 = i8 + 3;
                                                    path2.rQuadTo(fArr[i8], fArr[i25], fArr[i26], fArr[i27]);
                                                    f10 = fArr[i8] + f26;
                                                    f11 = fArr[i25] + f27;
                                                    f26 += fArr[i26];
                                                    f12 = fArr[i27];
                                                }
                                                f27 += f12;
                                                f20 = f10;
                                                f21 = f11;
                                            } else {
                                                fArr = fArr3;
                                                i8 = i13;
                                                path2.rLineTo(fArr[i8], 0.0f);
                                                f26 += fArr[i8];
                                            }
                                        } else {
                                            fArr = fArr3;
                                            i8 = i13;
                                            int i28 = i8 + 2;
                                            int i29 = i8 + 3;
                                            int i30 = i8 + 4;
                                            int i31 = i8 + 5;
                                            path2.rCubicTo(fArr[i8], fArr[i8 + 1], fArr[i28], fArr[i29], fArr[i30], fArr[i31]);
                                            float f36 = fArr[i28] + f26;
                                            float f37 = fArr[i29] + f27;
                                            f26 += fArr[i30];
                                            f27 += fArr[i31];
                                            f20 = f36;
                                            f21 = f37;
                                        }
                                        eVar = eVar3;
                                        f9 = f26;
                                        f8 = f27;
                                        i9 = i11;
                                        c6 = c10;
                                    } else {
                                        fArr = fArr3;
                                        i8 = i13;
                                        int i32 = i8 + 5;
                                        float f38 = fArr[i32] + f26;
                                        int i33 = i8 + 6;
                                        float f39 = fArr[i33] + f27;
                                        float f40 = fArr[i8];
                                        float f41 = fArr[i8 + 1];
                                        float f42 = fArr[i8 + 2];
                                        if (fArr[i8 + 3] != 0.0f) {
                                            eVar2 = eVar3;
                                            z10 = 1;
                                        } else {
                                            eVar2 = eVar3;
                                            z10 = i12;
                                        }
                                        eVar = eVar2;
                                        float f43 = f26;
                                        c6 = c10;
                                        if (fArr[i8 + 4] != 0.0f) {
                                            z11 = 1;
                                        } else {
                                            z11 = i12;
                                        }
                                        float f44 = f27;
                                        i9 = i11;
                                        a(path, f43, f44, f38, f39, f40, f41, f42, z10, z11);
                                        f9 = f43 + fArr[i32];
                                        f8 = f44 + fArr[i33];
                                        f20 = f9;
                                        f21 = f8;
                                    }
                                } else {
                                    fArr = fArr3;
                                    i8 = i13;
                                    i9 = i11;
                                    eVar = eVar3;
                                    f9 = f26;
                                    c6 = c10;
                                    path2.lineTo(f9, fArr[i8]);
                                    f8 = fArr[i8];
                                }
                            } else {
                                fArr = fArr3;
                                i8 = i13;
                                i9 = i11;
                                eVar = eVar3;
                                c6 = c10;
                                int i34 = i8 + 1;
                                int i35 = i8 + 2;
                                int i36 = i8 + 3;
                                path2.quadTo(fArr[i8], fArr[i34], fArr[i35], fArr[i36]);
                                float f45 = fArr[i8];
                                float f46 = fArr[i34];
                                float f47 = fArr[i35];
                                float f48 = fArr[i36];
                                f20 = f45;
                                f21 = f46;
                                f9 = f47;
                                f8 = f48;
                            }
                        } else {
                            fArr = fArr3;
                            i8 = i13;
                            eVar = eVar3;
                            c6 = c10;
                            f8 = f27;
                            i9 = i11;
                            path2.lineTo(fArr[i8], f8);
                            f9 = fArr[i8];
                        }
                    } else {
                        fArr = fArr3;
                        i8 = i13;
                        i9 = i11;
                        eVar = eVar3;
                        c6 = c10;
                        int i37 = i8 + 2;
                        int i38 = i8 + 3;
                        int i39 = i8 + 4;
                        int i40 = i8 + 5;
                        path2.cubicTo(fArr[i8], fArr[i8 + 1], fArr[i37], fArr[i38], fArr[i39], fArr[i40]);
                        float f49 = fArr[i39];
                        float f50 = fArr[i40];
                        f20 = fArr[i37];
                        f21 = fArr[i38];
                        f8 = f50;
                        f9 = f49;
                    }
                } else {
                    fArr = fArr3;
                    i8 = i13;
                    eVar = eVar3;
                    float f51 = f26;
                    float f52 = f27;
                    i9 = i11;
                    c6 = c10;
                    int i41 = i8 + 5;
                    float f53 = fArr[i41];
                    int i42 = i8 + 6;
                    float f54 = fArr[i42];
                    float f55 = fArr[i8];
                    float f56 = fArr[i8 + 1];
                    float f57 = fArr[i8 + 2];
                    if (fArr[i8 + 3] != 0.0f) {
                        z8 = 1;
                    } else {
                        z8 = i12;
                    }
                    if (fArr[i8 + 4] != 0.0f) {
                        z9 = 1;
                    } else {
                        z9 = i12;
                    }
                    a(path, f51, f52, f53, f54, f55, f56, f57, z8, z9);
                    f20 = fArr[i41];
                    f8 = fArr[i42];
                    f21 = f8;
                    f9 = f20;
                }
                i13 = i8 + i4;
                path2 = path;
                eVar3 = eVar;
                c10 = c6;
                i11 = i9;
                f26 = f9;
                f27 = f8;
                c9 = c10;
                fArr3 = fArr;
            }
            fArr2[i12] = f26;
            fArr2[1] = f27;
            fArr2[2] = f20;
            fArr2[3] = f21;
            fArr2[4] = f24;
            fArr2[5] = f25;
            c9 = eVar3.f1853a;
            i11++;
            eVarArr2 = eVarArr;
            path2 = path;
            i10 = i12;
        }
    }

    public e(e eVar) {
        this.f1853a = eVar.f1853a;
        float[] fArr = eVar.f1854b;
        this.f1854b = D2.f.g(fArr, fArr.length);
    }
}
