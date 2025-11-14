package B1;

import I7.m;
import T1.B;
import T1.C;
import T1.C0308g;
import T1.C0311j;
import T1.D;
import T1.EnumC0305d;
import T1.EnumC0306e;
import T1.EnumC0307f;
import T1.G;
import T1.H;
import T1.N;
import T1.p;
import T1.s;
import T1.t;
import T1.u;
import T1.y;
import T4.l;
import X7.i;
import Z7.C0382c;
import Z7.P;
import Z7.Q;
import a6.AbstractC0434i;
import a8.w;
import a8.z;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import androidx.lifecycle.e0;
import java.lang.reflect.Method;
import n2.C1153a;
import n2.EnumC1156d;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f431d;

    public /* synthetic */ e(int i4) {
        this.f431d = i4;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, Z5.g] */
    @Override // n6.InterfaceC1162a
    public final Object a() {
        Class<?> returnType;
        boolean z8;
        switch (this.f431d) {
            case 0:
                return new e0();
            case 1:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                try {
                    Method method = (Method) F0.c.f1260f.getValue();
                    if (method != null && (returnType = method.getReturnType()) != null) {
                        Class cls = Integer.TYPE;
                        return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                    }
                } catch (Throwable unused2) {
                }
                return null;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return Q.d("com.buzbuz.smartautoclicker.core.database.entity.ActionType", EnumC0305d.values());
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                return Q.d("com.buzbuz.smartautoclicker.core.database.entity.ClickPositionType", EnumC0307f.values());
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                return Q.d("com.buzbuz.smartautoclicker.core.database.entity.EventToggleType", B.values());
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                return Q.d("com.buzbuz.smartautoclicker.core.database.entity.ChangeCounterOperationType", EnumC0306e.values());
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                return Q.d("com.buzbuz.smartautoclicker.core.database.entity.CounterOperationValueType", u.values());
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                return Q.d("com.buzbuz.smartautoclicker.core.database.entity.NotificationMessageType", H.values());
            case 9:
                return Q.d("com.buzbuz.smartautoclicker.core.database.entity.SystemActionType", N.values());
            case 10:
                return new C0382c(D.f5510a);
            case 11:
                return new C0382c(y.f5660a);
            case 12:
                return new C0382c(C0308g.f5597a);
            case 13:
                return new C0382c(p.f5611a);
            case 14:
                return new C0382c(C0311j.f5602a);
            case 15:
                return Q.d("com.buzbuz.smartautoclicker.core.database.entity.ConditionType", s.values());
            case 16:
                return Q.d("com.buzbuz.smartautoclicker.core.database.entity.CounterComparisonOperation", t.values());
            case 17:
                return Q.d("com.buzbuz.smartautoclicker.core.database.entity.CounterOperationValueType", u.values());
            case 18:
                return Q.d("com.buzbuz.smartautoclicker.core.database.entity.EventType", C.values());
            case 19:
                return Q.d("com.buzbuz.smartautoclicker.core.database.entity.EventToggleType", B.values());
            case 20:
                return Q.d("com.buzbuz.smartautoclicker.core.database.entity.IntentExtraType", G.values());
            case 21:
                i iVar = i.f7076h;
                X7.f[] fVarArr = new X7.f[0];
                if (!m.j0("kotlin.Unit")) {
                    if (!iVar.equals(i.f7073e)) {
                        X7.a aVar = new X7.a("kotlin.Unit");
                        return new X7.g("kotlin.Unit", iVar, aVar.f7049b.size(), AbstractC0434i.i1(fVarArr), aVar);
                    }
                    throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
                }
                throw new IllegalArgumentException("Blank serial names are prohibited");
            case 22:
                return z.f8306b;
            case 23:
                return a8.s.f8298b;
            case 24:
                return a8.p.f8296b;
            case 25:
                return w.f8304b;
            case 26:
                return a8.f.f8288b;
            case 27:
                if (l.f5788b != null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                return Boolean.valueOf(z8);
            case 28:
                return Q.d("com.buzbuz.smartautoclicker.core.dumb.data.database.DumbActionType", EnumC1156d.values());
            default:
                return new C0382c(C1153a.f12865a);
        }
    }

    public /* synthetic */ e(P p8) {
        this.f431d = 21;
    }
}
