package B1;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.a0;
import com.buzbuz.smartautoclicker.core.ui.views.gesturerecord.GestureRecordView;
import com.buzbuz.smartautoclicker.core.ui.views.itembrief.ItemBriefView;
import n6.InterfaceC1162a;
import o6.j;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f432d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f433e;

    public /* synthetic */ f(Context context, int i4) {
        this.f432d = i4;
        this.f433e = context;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        int i4 = this.f432d;
        Context context = this.f433e;
        switch (i4) {
            case 0:
                Application application = (Application) context;
                if (a0.f8825c == null) {
                    a0.f8825c = new a0(application);
                }
                a0 a0Var = a0.f8825c;
                j.b(a0Var);
                return a0Var;
            case 1:
                int i8 = GestureRecordView.f9785h;
                return (Y1.d) ((c1.h) ((Z1.a) D2.f.p(context.getApplicationContext(), Z1.a.class))).f9471d.get();
            default:
                int i9 = ItemBriefView.f9790i;
                return (Y1.d) ((c1.h) ((Z1.a) D2.f.p(context.getApplicationContext(), Z1.a.class))).f9471d.get();
        }
    }
}
