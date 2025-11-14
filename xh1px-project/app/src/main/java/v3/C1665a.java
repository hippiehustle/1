package v3;

import E.i;
import E.j;
import W0.d;
import android.app.Notification;
import android.content.Context;
import android.os.Build;
import android.widget.RemoteViews;
import com.buzbuz.smartautoclicker.R;
import com.buzbuz.smartautoclicker.SmartAutoClickerService;
import i.AbstractC0863b;
import i1.C0879a;
import t3.AbstractC1571i;
import t3.C1565c;
import t3.C1566d;
import t3.C1567e;
import t3.C1568f;
import t3.C1569g;
import t3.C1570h;
import t3.C1572j;

/* renamed from: v3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1665a extends j {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f15515u;

    /* renamed from: v, reason: collision with root package name */
    public final C0879a f15516v;

    public C1665a(SmartAutoClickerService smartAutoClickerService) {
        super(smartAutoClickerService, "KlickrService");
    }

    public static void e(C1665a c1665a, Context context, AbstractC1571i abstractC1571i) {
        c1665a.f1109b.add(new i(abstractC1571i.a(), context.getString(abstractC1571i.b()), AbstractC0863b.o(abstractC1571i, context, c1665a.f15516v)));
    }

    public void d(RemoteViews remoteViews, Context context, int i4, AbstractC1571i abstractC1571i) {
        remoteViews.setImageViewResource(i4, abstractC1571i.a());
        remoteViews.setOnClickPendingIntent(i4, AbstractC0863b.o(abstractC1571i, context, this.f15516v));
    }

    public final void f(Context context, C1572j c1572j) {
        AbstractC1571i abstractC1571i;
        AbstractC1571i abstractC1571i2;
        AbstractC1571i abstractC1571i3;
        AbstractC1571i abstractC1571i4;
        switch (this.f15515u) {
            case 0:
                o6.j.e(context, "context");
                o6.j.e(c1572j, "state");
                boolean z8 = c1572j.f15059c;
                RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.notification_service);
                String str = c1572j.f15057a;
                remoteViews.setTextViewText(R.id.text_scenario_name, context.getString(R.string.notification_title, A.j.o("\n", str)));
                boolean z9 = c1572j.f15058b;
                AbstractC1571i abstractC1571i5 = C1568f.f15054a;
                AbstractC1571i abstractC1571i6 = C1567e.f15053a;
                if (z9) {
                    abstractC1571i = abstractC1571i6;
                } else {
                    abstractC1571i = abstractC1571i5;
                }
                d(remoteViews, context, R.id.button_play_pause, abstractC1571i);
                AbstractC1571i abstractC1571i7 = C1569g.f15055a;
                AbstractC1571i abstractC1571i8 = C1566d.f15052a;
                if (z8) {
                    abstractC1571i2 = abstractC1571i8;
                } else {
                    abstractC1571i2 = abstractC1571i7;
                }
                d(remoteViews, context, R.id.button_show_hide, abstractC1571i2);
                this.f1120o = remoteViews;
                RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), R.layout.notification_service_big);
                remoteViews2.setTextViewText(R.id.text_scenario_name, str);
                if (z9) {
                    abstractC1571i5 = abstractC1571i6;
                }
                d(remoteViews2, context, R.id.button_play_pause, abstractC1571i5);
                if (z8) {
                    abstractC1571i7 = abstractC1571i8;
                }
                d(remoteViews2, context, R.id.button_show_hide, abstractC1571i7);
                d(remoteViews2, context, R.id.button_config, C1565c.f15051a);
                d(remoteViews2, context, R.id.button_exit, C1570h.f15056a);
                this.f1121p = remoteViews2;
                return;
            default:
                o6.j.e(context, "context");
                o6.j.e(c1572j, "state");
                this.f1109b.clear();
                if (c1572j.f15058b) {
                    abstractC1571i3 = C1567e.f15053a;
                } else {
                    abstractC1571i3 = C1568f.f15054a;
                }
                e(this, context, abstractC1571i3);
                if (c1572j.f15059c) {
                    abstractC1571i4 = C1566d.f15052a;
                } else {
                    abstractC1571i4 = C1569g.f15055a;
                }
                e(this, context, abstractC1571i4);
                e(this, context, C1570h.f15056a);
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1665a(SmartAutoClickerService smartAutoClickerService, C1572j c1572j, C0879a c0879a, int i4) {
        this(smartAutoClickerService);
        this.f15515u = i4;
        switch (i4) {
            case 1:
                o6.j.e(c1572j, "initialState");
                o6.j.e(c0879a, "appComponentsProvider");
                this(smartAutoClickerService);
                this.f15516v = c0879a;
                this.f1112e = j.b(smartAutoClickerService.getString(R.string.notification_title, c1572j.f15057a));
                this.f1113f = j.b(smartAutoClickerService.getString(R.string.notification_message));
                this.f1114g = AbstractC0863b.o(C1565c.f15051a, smartAutoClickerService, c0879a);
                int i8 = Build.VERSION.SDK_INT >= 29 ? R.drawable.ic_notification_vector : R.drawable.ic_action_notification;
                Notification notification = this.f1124s;
                notification.icon = i8;
                this.f1118m = "service";
                notification.flags |= 2;
                this.f1117l = true;
                f(smartAutoClickerService, c1572j);
                return;
            default:
                o6.j.e(c1572j, "initialState");
                o6.j.e(c0879a, "appComponentsProvider");
                this.f15516v = c0879a;
                int i9 = Build.VERSION.SDK_INT >= 29 ? R.drawable.ic_notification_vector : R.drawable.ic_action_notification;
                Notification notification2 = this.f1124s;
                notification2.icon = i9;
                this.f1118m = "service";
                notification2.flags |= 2;
                this.f1117l = true;
                c(new d(3, false));
                f(smartAutoClickerService, c1572j);
                return;
        }
    }
}
