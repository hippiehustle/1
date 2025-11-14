package G;

import android.graphics.Color;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f1635a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1636b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1637c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1638d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1639e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1640f;

    public a(float f8, float f9, float f10, float f11, float f12, float f13) {
        this.f1635a = f8;
        this.f1636b = f9;
        this.f1637c = f10;
        this.f1638d = f11;
        this.f1639e = f12;
        this.f1640f = f13;
    }

    public static a a(int i4) {
        float f8;
        o oVar = o.k;
        float e9 = b.e(Color.red(i4));
        float e10 = b.e(Color.green(i4));
        float e11 = b.e(Color.blue(i4));
        float[][] fArr = b.f1644d;
        float[] fArr2 = fArr[0];
        float f9 = (fArr2[2] * e11) + (fArr2[1] * e10) + (fArr2[0] * e9);
        float[] fArr3 = fArr[1];
        float f10 = (fArr3[2] * e11) + (fArr3[1] * e10) + (fArr3[0] * e9);
        float[] fArr4 = fArr[2];
        float f11 = (e11 * fArr4[2]) + (e10 * fArr4[1]) + (e9 * fArr4[0]);
        float[][] fArr5 = b.f1641a;
        float[] fArr6 = fArr5[0];
        float f12 = (fArr6[2] * f11) + (fArr6[1] * f10) + (fArr6[0] * f9);
        float[] fArr7 = fArr5[1];
        float f13 = (fArr7[2] * f11) + (fArr7[1] * f10) + (fArr7[0] * f9);
        float[] fArr8 = fArr5[2];
        float f14 = (f11 * fArr8[2]) + (f10 * fArr8[1]) + (f9 * fArr8[0]);
        float[] fArr9 = oVar.f1685g;
        float f15 = oVar.f1687i;
        float f16 = oVar.f1682d;
        float f17 = oVar.f1679a;
        float f18 = fArr9[0] * f12;
        float f19 = fArr9[1] * f13;
        float f20 = fArr9[2] * f14;
        float f21 = oVar.f1686h;
        float pow = (float) Math.pow((Math.abs(f18) * f21) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((Math.abs(f19) * f21) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f20) * f21) / 100.0d, 0.42d);
        float signum = ((Math.signum(f18) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f19) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f20) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d2 = signum3;
        float f22 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d2)) / 11.0f;
        float f23 = ((float) ((signum + signum2) - (d2 * 2.0d))) / 9.0f;
        float f24 = signum2 * 20.0f;
        float f25 = ((21.0f * signum3) + ((signum * 20.0f) + f24)) / 20.0f;
        float f26 = (((signum * 40.0f) + f24) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f23, f22)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f27 = (3.1415927f * atan2) / 180.0f;
        float pow4 = ((float) Math.pow((f26 * oVar.f1680b) / f17, oVar.j * f16)) * 100.0f;
        Math.sqrt(pow4 / 100.0f);
        float f28 = f17 + 4.0f;
        if (atan2 < 20.14d) {
            f8 = 360.0f + atan2;
        } else {
            f8 = atan2;
        }
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, oVar.f1684f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((f8 * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * oVar.f1683e) * oVar.f1681c) * ((float) Math.sqrt((f23 * f23) + (f22 * f22)))) / (f25 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        Math.sqrt((r0 * f16) / f28);
        float f29 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((f15 * pow5 * 0.0228f) + 1.0f)) * 43.85965f;
        double d3 = f27;
        return new a(atan2, pow5, pow4, f29, log * ((float) Math.cos(d3)), log * ((float) Math.sin(d3)));
    }

    public static a b(float f8, float f9, float f10) {
        o oVar = o.k;
        float f11 = oVar.f1682d;
        Math.sqrt(f8 / 100.0d);
        float f12 = oVar.f1679a + 4.0f;
        float f13 = oVar.f1687i * f9;
        Math.sqrt(((f9 / ((float) Math.sqrt(r1))) * oVar.f1682d) / f12);
        float f14 = (1.7f * f8) / ((0.007f * f8) + 1.0f);
        float log = ((float) Math.log((f13 * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f10) / 180.0f;
        return new a(f10, f9, f8, f14, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    public final int c(o oVar) {
        float f8;
        float f9 = this.f1636b;
        double d2 = f9;
        float f10 = this.f1637c;
        if (d2 != 0.0d) {
            double d3 = f10;
            if (d3 != 0.0d) {
                f8 = f9 / ((float) Math.sqrt(d3 / 100.0d));
                float f11 = oVar.f1684f;
                float f12 = oVar.f1686h;
                float pow = (float) Math.pow(f8 / Math.pow(1.64d - Math.pow(0.29d, f11), 0.73d), 1.1111111111111112d);
                double d9 = (this.f1635a * 3.1415927f) / 180.0f;
                float cos = ((float) (Math.cos(2.0d + d9) + 3.8d)) * 0.25f;
                float pow2 = oVar.f1679a * ((float) Math.pow(f10 / 100.0d, (1.0d / oVar.f1682d) / oVar.j));
                float f13 = cos * 3846.1538f * oVar.f1683e * oVar.f1681c;
                float f14 = pow2 / oVar.f1680b;
                float sin = (float) Math.sin(d9);
                float cos2 = (float) Math.cos(d9);
                float f15 = (((0.305f + f14) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (f13 * 23.0f)));
                float f16 = cos2 * f15;
                float f17 = f15 * sin;
                float f18 = f14 * 460.0f;
                float f19 = ((288.0f * f17) + ((451.0f * f16) + f18)) / 1403.0f;
                float f20 = ((f18 - (891.0f * f16)) - (261.0f * f17)) / 1403.0f;
                float f21 = ((f18 - (f16 * 220.0f)) - (f17 * 6300.0f)) / 1403.0f;
                float f22 = 100.0f / f12;
                float signum = Math.signum(f19) * f22 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f19) * 27.13d) / (400.0d - Math.abs(f19))), 2.380952380952381d));
                float signum2 = Math.signum(f20) * f22 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f20) * 27.13d) / (400.0d - Math.abs(f20))), 2.380952380952381d));
                float signum3 = Math.signum(f21) * f22 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f21) * 27.13d) / (400.0d - Math.abs(f21))), 2.380952380952381d));
                float[] fArr = oVar.f1685g;
                float f23 = signum / fArr[0];
                float f24 = signum2 / fArr[1];
                float f25 = signum3 / fArr[2];
                float[][] fArr2 = b.f1642b;
                float[] fArr3 = fArr2[0];
                float f26 = (fArr3[2] * f25) + (fArr3[1] * f24) + (fArr3[0] * f23);
                float[] fArr4 = fArr2[1];
                float f27 = (fArr4[2] * f25) + (fArr4[1] * f24) + (fArr4[0] * f23);
                float[] fArr5 = fArr2[2];
                return H.b.a(f26, f27, (f25 * fArr5[2]) + (f24 * fArr5[1]) + (f23 * fArr5[0]));
            }
        }
        f8 = 0.0f;
        float f112 = oVar.f1684f;
        float f122 = oVar.f1686h;
        float pow3 = (float) Math.pow(f8 / Math.pow(1.64d - Math.pow(0.29d, f112), 0.73d), 1.1111111111111112d);
        double d92 = (this.f1635a * 3.1415927f) / 180.0f;
        float cos3 = ((float) (Math.cos(2.0d + d92) + 3.8d)) * 0.25f;
        float pow22 = oVar.f1679a * ((float) Math.pow(f10 / 100.0d, (1.0d / oVar.f1682d) / oVar.j));
        float f132 = cos3 * 3846.1538f * oVar.f1683e * oVar.f1681c;
        float f142 = pow22 / oVar.f1680b;
        float sin2 = (float) Math.sin(d92);
        float cos22 = (float) Math.cos(d92);
        float f152 = (((0.305f + f142) * 23.0f) * pow3) / (((pow3 * 108.0f) * sin2) + (((11.0f * pow3) * cos22) + (f132 * 23.0f)));
        float f162 = cos22 * f152;
        float f172 = f152 * sin2;
        float f182 = f142 * 460.0f;
        float f192 = ((288.0f * f172) + ((451.0f * f162) + f182)) / 1403.0f;
        float f202 = ((f182 - (891.0f * f162)) - (261.0f * f172)) / 1403.0f;
        float f212 = ((f182 - (f162 * 220.0f)) - (f172 * 6300.0f)) / 1403.0f;
        float f222 = 100.0f / f122;
        float signum4 = Math.signum(f192) * f222 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f192) * 27.13d) / (400.0d - Math.abs(f192))), 2.380952380952381d));
        float signum22 = Math.signum(f202) * f222 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f202) * 27.13d) / (400.0d - Math.abs(f202))), 2.380952380952381d));
        float signum32 = Math.signum(f212) * f222 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f212) * 27.13d) / (400.0d - Math.abs(f212))), 2.380952380952381d));
        float[] fArr6 = oVar.f1685g;
        float f232 = signum4 / fArr6[0];
        float f242 = signum22 / fArr6[1];
        float f252 = signum32 / fArr6[2];
        float[][] fArr22 = b.f1642b;
        float[] fArr32 = fArr22[0];
        float f262 = (fArr32[2] * f252) + (fArr32[1] * f242) + (fArr32[0] * f232);
        float[] fArr42 = fArr22[1];
        float f272 = (fArr42[2] * f252) + (fArr42[1] * f242) + (fArr42[0] * f232);
        float[] fArr52 = fArr22[2];
        return H.b.a(f262, f272, (f252 * fArr52[2]) + (f242 * fArr52[1]) + (f232 * fArr52[0]));
    }
}
