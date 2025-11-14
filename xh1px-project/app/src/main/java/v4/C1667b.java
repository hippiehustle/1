package v4;

import O7.i0;
import Z5.y;
import a.AbstractC0405a;
import android.util.Log;
import com.buzbuz.smartautoclicker.feature.qstile.ui.QSTileLauncherActivity;
import e.C0629e;
import n6.InterfaceC1162a;
import w0.C1686d;
import w4.C1706k;
import y3.C1838g;

/* renamed from: v4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1667b extends o6.i implements InterfaceC1162a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f15519l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1667b(int i4, Object obj, Class cls, String str, String str2, int i8, int i9, int i10) {
        super(i4, obj, cls, str, str2, i8, i9);
        this.f15519l = i10;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        int i4 = this.f15519l;
        int i8 = 1;
        y yVar = y.f7506a;
        Object obj = this.f13629e;
        switch (i4) {
            case 0:
                i0 i0Var = ((C1676k) obj).f15539d;
                i0Var.h(null, Boolean.valueOf(true ^ ((Boolean) i0Var.f()).booleanValue()));
                return yVar;
            case 1:
                i0 i0Var2 = ((C1676k) obj).f15541f;
                i0Var2.h(null, Boolean.valueOf(true ^ ((Boolean) i0Var2.f()).booleanValue()));
                return yVar;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                C3.e eVar = ((C1706k) obj).f15708b.f1948c;
                E3.a aVar = (E3.a) eVar.f601h.f();
                if (aVar != null) {
                    aVar.g();
                }
                eVar.f596c.g(null);
                return yVar;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                ((QSTileLauncherActivity) obj).finish();
                return yVar;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                ((QSTileLauncherActivity) obj).finish();
                return yVar;
            default:
                QSTileLauncherActivity qSTileLauncherActivity = (QSTileLauncherActivity) obj;
                int i9 = QSTileLauncherActivity.f9796I;
                qSTileLauncherActivity.getClass();
                Log.i("QSTileLauncherActivity", "All permissions are granted, request media projection");
                C0629e c0629e = qSTileLauncherActivity.f9802H;
                if (c0629e != null) {
                    AbstractC0405a.A0(c0629e, qSTileLauncherActivity, ((Boolean) ((C1838g) qSTileLauncherActivity.f9801G.getValue()).f16509g.f16109g.f4088d.f()).booleanValue(), new C1686d(i8, qSTileLauncherActivity));
                    return yVar;
                }
                o6.j.i("projectionActivityResult");
                throw null;
        }
    }
}
