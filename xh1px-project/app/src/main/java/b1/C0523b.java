package b1;

import E.f;
import L7.AbstractC0166y;
import P1.l;
import P1.o;
import Y1.d;
import Z5.y;
import android.app.Notification;
import android.os.Build;
import com.buzbuz.smartautoclicker.SmartAutoClickerService;
import h1.AbstractC0812e;
import h4.g;
import n6.InterfaceC1165d;
import o6.i;
import o6.j;
import x3.C1786c;
import x3.C1787d;

/* renamed from: b1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0523b extends i implements InterfaceC1165d {
    @Override // n6.InterfaceC1165d
    public final Object j(Object obj, Object obj2, Object obj3) {
        long longValue = ((Number) obj).longValue();
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        Notification notification = (Notification) obj3;
        SmartAutoClickerService smartAutoClickerService = (SmartAutoClickerService) this.f13629e;
        int i4 = SmartAutoClickerService.f9743v;
        if (smartAutoClickerService.f9757s != null) {
            o oVar = smartAutoClickerService.f9752n;
            if (oVar != null) {
                AbstractC0166y.q(oVar.f4472b, null, null, new l(oVar, null), 3);
                if (notification != null) {
                    int i8 = Build.VERSION.SDK_INT;
                    if (i8 >= 29) {
                        if (i8 >= 34) {
                            f.f(smartAutoClickerService, notification);
                        } else if (i8 >= 29) {
                            f.e(smartAutoClickerService, notification);
                        } else {
                            smartAutoClickerService.startForeground(1, notification);
                        }
                    } else {
                        smartAutoClickerService.startForeground(1, notification);
                    }
                }
                g.s(smartAutoClickerService, true);
                d dVar = smartAutoClickerService.f9749i;
                if (dVar != null) {
                    dVar.f7104e = d.a(dVar.f7104e, dVar.b());
                    AbstractC0812e.c(dVar.f7103d, smartAutoClickerService);
                    C1787d c1787d = smartAutoClickerService.f9755q;
                    if (c1787d != null) {
                        AbstractC0166y.q(c1787d.f16125f, null, null, new C1786c(c1787d, longValue, booleanValue, null), 3);
                        return y.f7506a;
                    }
                    j.i("tileRepository");
                    throw null;
                }
                j.i("displayConfigManager");
                throw null;
            }
            j.i("qualityMetricsMonitor");
            throw null;
        }
        j.i("reviewRepository");
        throw null;
    }
}
