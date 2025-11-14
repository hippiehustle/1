package s3;

import E.t;
import L1.e;
import android.content.Context;
import android.util.Log;
import com.buzbuz.smartautoclicker.SmartAutoClickerService;
import i1.C0879a;
import k4.I;
import o6.C1282a;
import o6.j;
import t3.C1572j;
import u3.C1631a;
import v3.C1665a;
import x2.f;

/* renamed from: s3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1491b {

    /* renamed from: a, reason: collision with root package name */
    public final f f14512a;

    /* renamed from: b, reason: collision with root package name */
    public final C0879a f14513b;

    /* renamed from: c, reason: collision with root package name */
    public final t f14514c;

    /* renamed from: d, reason: collision with root package name */
    public final Y1.c f14515d;

    /* renamed from: e, reason: collision with root package name */
    public final C1631a f14516e;

    /* renamed from: f, reason: collision with root package name */
    public C1572j f14517f;

    /* renamed from: g, reason: collision with root package name */
    public C1665a f14518g;

    /* JADX WARN: Type inference failed for: r0v2, types: [s3.a, o6.a] */
    public C1491b(SmartAutoClickerService smartAutoClickerService, f fVar, C0879a c0879a, T4.c cVar) {
        j.e(fVar, "settingsRepository");
        j.e(c0879a, "appComponentsProvider");
        this.f14512a = fVar;
        this.f14513b = c0879a;
        this.f14514c = new t(smartAutoClickerService);
        this.f14515d = new Y1.c(new C1282a(1, cVar, AbstractC1492c.class, "notifyAction", "notifyAction(Lcom/buzbuz/smartautoclicker/feature/notifications/ServiceNotificationListener;Lcom/buzbuz/smartautoclicker/feature/notifications/model/ServiceNotificationAction;)Lkotlin/Unit;", 9));
        this.f14516e = new C1631a(new I(2, this, C1491b.class, "updateNotification", "updateNotification(Landroid/content/Context;Z)V", 0, 0, 5));
    }

    public final void a(Context context, C1572j c1572j) {
        C1665a c1665a = this.f14518g;
        if (c1665a == null || !new e(false).a(context)) {
            return;
        }
        Log.i("ServiceNotificationManager", "Updating notification: " + c1572j);
        this.f14517f = c1572j;
        c1665a.f(context, c1572j);
        this.f14514c.b(1, c1665a.a());
    }
}
