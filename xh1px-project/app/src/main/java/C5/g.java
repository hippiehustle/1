package C5;

import J0.C0070d;
import J0.z;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import i0.C0878a;
import java.util.ArrayList;
import n1.AbstractC1149a;
import o.Z0;

/* loaded from: classes.dex */
public final class g extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f664a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Class cls, String str, int i4) {
        super(cls, str);
        this.f664a = i4;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f664a) {
            case 0:
                return Float.valueOf(((h) obj).f674h);
            case 1:
                return Float.valueOf(((h) obj).f675i);
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return Float.valueOf(((m) obj).b());
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return null;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                return null;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                return null;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                return null;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                return null;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                return Float.valueOf(z.f2347a.S((View) obj));
            case 9:
                return ((View) obj).getClipBounds();
            default:
                return Float.valueOf(((Z0) obj).f13180C);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f664a) {
            case 0:
                h hVar = (h) obj;
                float floatValue = ((Float) obj2).floatValue();
                hVar.f674h = floatValue;
                int i4 = (int) (floatValue * 5400.0f);
                C0878a c0878a = hVar.f671e;
                ArrayList arrayList = (ArrayList) hVar.f707b;
                n nVar = (n) arrayList.get(0);
                float f8 = hVar.f674h * 1520.0f;
                nVar.f702a = (-20.0f) + f8;
                nVar.f703b = f8;
                for (int i8 = 0; i8 < 4; i8++) {
                    float f9 = 667;
                    nVar.f703b = (c0878a.getInterpolation((i4 - h.k[i8]) / f9) * 250.0f) + nVar.f703b;
                    nVar.f702a = (c0878a.getInterpolation((i4 - h.f665l[i8]) / f9) * 250.0f) + nVar.f702a;
                }
                float f10 = nVar.f702a;
                float f11 = nVar.f703b;
                nVar.f702a = (((f11 - f10) * hVar.f675i) + f10) / 360.0f;
                nVar.f703b = f11 / 360.0f;
                int i9 = 0;
                while (true) {
                    if (i9 < 4) {
                        float f12 = (i4 - h.f666m[i9]) / 333;
                        if (f12 >= 0.0f && f12 <= 1.0f) {
                            int i10 = i9 + hVar.f673g;
                            int[] iArr = hVar.f672f.f678c;
                            int length = i10 % iArr.length;
                            int length2 = (length + 1) % iArr.length;
                            int i11 = iArr[length];
                            int i12 = iArr[length2];
                            float interpolation = c0878a.getInterpolation(f12);
                            n nVar2 = (n) arrayList.get(0);
                            Integer valueOf = Integer.valueOf(i11);
                            Integer valueOf2 = Integer.valueOf(i12);
                            int intValue = valueOf.intValue();
                            float f13 = ((intValue >> 24) & 255) / 255.0f;
                            int intValue2 = valueOf2.intValue();
                            float f14 = ((intValue2 >> 24) & 255) / 255.0f;
                            float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
                            float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
                            float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
                            float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
                            float pow5 = (float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d);
                            float pow6 = (float) Math.pow((intValue2 & 255) / 255.0f, 2.2d);
                            float a3 = AbstractC1149a.a(f14, f13, interpolation, f13);
                            float a4 = AbstractC1149a.a(pow4, pow, interpolation, pow);
                            float a9 = AbstractC1149a.a(pow5, pow2, interpolation, pow2);
                            float a10 = AbstractC1149a.a(pow6, pow3, interpolation, pow3);
                            float pow7 = ((float) Math.pow(a4, 0.45454545454545453d)) * 255.0f;
                            float pow8 = ((float) Math.pow(a9, 0.45454545454545453d)) * 255.0f;
                            nVar2.f704c = Integer.valueOf(Math.round(((float) Math.pow(a10, 0.45454545454545453d)) * 255.0f) | (Math.round(pow7) << 16) | (Math.round(a3 * 255.0f) << 24) | (Math.round(pow8) << 8)).intValue();
                        } else {
                            i9++;
                        }
                    }
                }
                ((q) hVar.f706a).invalidateSelf();
                return;
            case 1:
                ((h) obj).f675i = ((Float) obj2).floatValue();
                return;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                m mVar = (m) obj;
                float floatValue2 = ((Float) obj2).floatValue();
                if (mVar.k != floatValue2) {
                    mVar.k = floatValue2;
                    mVar.invalidateSelf();
                    return;
                }
                return;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                C0070d c0070d = (C0070d) obj;
                PointF pointF = (PointF) obj2;
                c0070d.getClass();
                c0070d.f2276a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                c0070d.f2277b = round;
                int i13 = c0070d.f2281f + 1;
                c0070d.f2281f = i13;
                if (i13 == c0070d.f2282g) {
                    z.a(c0070d.f2280e, c0070d.f2276a, round, c0070d.f2278c, c0070d.f2279d);
                    c0070d.f2281f = 0;
                    c0070d.f2282g = 0;
                    return;
                }
                return;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                C0070d c0070d2 = (C0070d) obj;
                PointF pointF2 = (PointF) obj2;
                c0070d2.getClass();
                c0070d2.f2278c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                c0070d2.f2279d = round2;
                int i14 = c0070d2.f2282g + 1;
                c0070d2.f2282g = i14;
                if (c0070d2.f2281f == i14) {
                    z.a(c0070d2.f2280e, c0070d2.f2276a, c0070d2.f2277b, c0070d2.f2278c, round2);
                    c0070d2.f2281f = 0;
                    c0070d2.f2282g = 0;
                    return;
                }
                return;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                z.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                return;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                z.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                return;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round3 = Math.round(pointF5.x);
                int round4 = Math.round(pointF5.y);
                z.a(view3, round3, round4, view3.getWidth() + round3, view3.getHeight() + round4);
                return;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                z.f2347a.t0((View) obj, ((Float) obj2).floatValue());
                return;
            case 9:
                ((View) obj).setClipBounds((Rect) obj2);
                return;
            default:
                ((Z0) obj).setThumbPosition(((Float) obj2).floatValue());
                return;
        }
    }
}
