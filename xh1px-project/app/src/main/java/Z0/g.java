package Z0;

import P0.l;
import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final PointF f7273a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f8, float f9, float f10) {
        return Math.max(f9, Math.min(f10, f8));
    }

    public static int c(int i4) {
        return Math.max(0, Math.min(255, i4));
    }

    public static int d(float f8, float f9) {
        boolean z8;
        int i4 = (int) f8;
        int i8 = (int) f9;
        int i9 = i4 / i8;
        if ((i4 ^ i8) >= 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        int i10 = i4 % i8;
        if (!z8 && i10 != 0) {
            i9--;
        }
        return i4 - (i8 * i9);
    }

    public static void e(U0.k kVar, Path path) {
        Path path2;
        path.reset();
        PointF pointF = kVar.f5987b;
        ArrayList arrayList = kVar.f5986a;
        path.moveTo(pointF.x, pointF.y);
        float f8 = pointF.x;
        float f9 = pointF.y;
        PointF pointF2 = f7273a;
        pointF2.set(f8, f9);
        int i4 = 0;
        while (i4 < arrayList.size()) {
            S0.a aVar = (S0.a) arrayList.get(i4);
            PointF pointF3 = aVar.f5175a;
            PointF pointF4 = aVar.f5176b;
            PointF pointF5 = aVar.f5177c;
            if (pointF3.equals(pointF2) && pointF4.equals(pointF5)) {
                path.lineTo(pointF5.x, pointF5.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(pointF3.x, pointF3.y, pointF4.x, pointF4.y, pointF5.x, pointF5.y);
            }
            pointF2.set(pointF5.x, pointF5.y);
            i4++;
            path = path2;
        }
        Path path3 = path;
        if (kVar.f5988c) {
            path3.close();
        }
    }

    public static float f(float f8, float f9, float f10) {
        return AbstractC1149a.a(f9, f8, f10, f8);
    }

    public static void g(S0.e eVar, int i4, ArrayList arrayList, S0.e eVar2, l lVar) {
        if (eVar.a(lVar.getName(), i4)) {
            String name = lVar.getName();
            S0.e eVar3 = new S0.e(eVar2);
            eVar3.f5199a.add(name);
            S0.e eVar4 = new S0.e(eVar3);
            eVar4.f5200b = lVar;
            arrayList.add(eVar4);
        }
    }
}
