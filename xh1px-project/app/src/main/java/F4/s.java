package F4;

import L7.AbstractC0166y;
import L7.F;
import S1.K;
import S1.L;
import android.util.Log;
import com.buzbuz.smartautoclicker.core.database.TutorialDatabase;
import e6.EnumC0646a;
import f6.AbstractC0713c;
import i.AbstractC0863b;
import l1.C0999a;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final TutorialDatabase f1424a;

    /* renamed from: b, reason: collision with root package name */
    public final q1.e f1425b;

    /* renamed from: c, reason: collision with root package name */
    public final b2.r f1426c;

    /* renamed from: d, reason: collision with root package name */
    public final r f1427d;

    public s(TutorialDatabase tutorialDatabase, q1.e eVar, b2.r rVar) {
        o6.j.e(tutorialDatabase, "tutorialDatabase");
        o6.j.e(eVar, "bitmapManager");
        o6.j.e(rVar, "scenarioRepository");
        this.f1424a = tutorialDatabase;
        this.f1425b = eVar;
        this.f1426c = rVar;
        this.f1427d = new r(AbstractC0863b.c(tutorialDatabase.s().f5241a, false, new String[]{"tutorial_success_table"}, new H7.o(17)), 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(s sVar, int i4, AbstractC0713c abstractC0713c) {
        m mVar;
        int i8;
        Long l6;
        sVar.getClass();
        if (abstractC0713c instanceof m) {
            mVar = (m) abstractC0713c;
            int i9 = mVar.f1409i;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                mVar.f1409i = i9 - Integer.MIN_VALUE;
                Object obj = mVar.f1407g;
                i8 = mVar.f1409i;
                if (i8 == 0) {
                    if (i8 == 1) {
                        Z5.a.d(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Z5.a.d(obj);
                    L s8 = sVar.f1424a.s();
                    mVar.f1409i = 1;
                    obj = D2.f.C(mVar, new K(i4, 0), s8.f5241a, true, false);
                    EnumC0646a enumC0646a = EnumC0646a.f10656d;
                    if (obj == enumC0646a) {
                        return enumC0646a;
                    }
                }
                l6 = (Long) obj;
                if (l6 != null) {
                    return null;
                }
                return new C0999a(l6.longValue(), (Long) null);
            }
        }
        mVar = new m(sVar, abstractC0713c);
        Object obj2 = mVar.f1407g;
        i8 = mVar.f1409i;
        if (i8 == 0) {
        }
        l6 = (Long) obj2;
        if (l6 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(int i4, AbstractC0713c abstractC0713c) {
        n nVar;
        int i8;
        Long l6;
        if (abstractC0713c instanceof n) {
            nVar = (n) abstractC0713c;
            int i9 = nVar.j;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                nVar.j = i9 - Integer.MIN_VALUE;
                Object obj = nVar.f1411h;
                i8 = nVar.j;
                if (i8 == 0) {
                    if (i8 == 1) {
                        i4 = nVar.f1410g;
                        Z5.a.d(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Z5.a.d(obj);
                    S7.e eVar = F.f3175a;
                    S7.d dVar = S7.d.f5456f;
                    o oVar = new o(i4, this, null);
                    nVar.f1410g = i4;
                    nVar.j = 1;
                    obj = AbstractC0166y.A(dVar, oVar, nVar);
                    EnumC0646a enumC0646a = EnumC0646a.f10656d;
                    if (obj == enumC0646a) {
                        return enumC0646a;
                    }
                }
                l6 = (Long) obj;
                if (l6 == null) {
                    Log.e("TutorialStateDataSource", "Can't get the scenario for the tutorial " + i4);
                }
                return l6;
            }
        }
        nVar = new n(this, abstractC0713c);
        Object obj2 = nVar.f1411h;
        i8 = nVar.j;
        if (i8 == 0) {
        }
        l6 = (Long) obj2;
        if (l6 == null) {
        }
        return l6;
    }
}
