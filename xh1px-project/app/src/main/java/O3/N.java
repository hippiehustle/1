package O3;

import O7.InterfaceC0234g;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import d1.C0594a;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import kotlin.NoWhenBranchMatchedException;
import s3.AbstractC1492c;

/* loaded from: classes.dex */
public final class N implements InterfaceC0234g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3889d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0234g f3890e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0 f3891f;

    public /* synthetic */ N(InterfaceC0234g interfaceC0234g, a0 a0Var, int i4) {
        this.f3889d = i4;
        this.f3890e = interfaceC0234g;
        this.f3891f = a0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0087  */
    @Override // O7.InterfaceC0234g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        M m6;
        int i4;
        ResolveInfo resolveActivity;
        PackageManager.ResolveInfoFlags of;
        Y y4;
        int i8;
        D2.d dVar;
        switch (this.f3889d) {
            case 0:
                if (interfaceC0617c instanceof M) {
                    m6 = (M) interfaceC0617c;
                    int i9 = m6.f3887h;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        m6.f3887h = i9 - Integer.MIN_VALUE;
                        Object obj2 = m6.f3886g;
                        i4 = m6.f3887h;
                        if (i4 == 0) {
                            if (i4 == 1) {
                                Z5.a.d(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj2);
                            f2.f fVar = (f2.f) obj;
                            C0594a c0594a = null;
                            if (fVar.f10706h != null) {
                                PackageManager packageManager = this.f3891f.f3927e;
                                Intent intent = new Intent(fVar.f10705g);
                                ComponentName componentName = fVar.f10706h;
                                o6.j.b(componentName);
                                Intent component = intent.setComponent(componentName);
                                o6.j.d(component, "setComponent(...)");
                                o6.j.e(packageManager, "<this>");
                                if (Build.VERSION.SDK_INT >= 33) {
                                    of = PackageManager.ResolveInfoFlags.of(0);
                                    resolveActivity = packageManager.resolveActivity(component, of);
                                } else {
                                    resolveActivity = packageManager.resolveActivity(component, 0);
                                }
                                if (resolveActivity != null) {
                                    c0594a = AbstractC1492c.J(resolveActivity, packageManager);
                                }
                            }
                            m6.f3887h = 1;
                            Object n3 = this.f3890e.n(c0594a, m6);
                            EnumC0646a enumC0646a = EnumC0646a.f10656d;
                            if (n3 == enumC0646a) {
                                return enumC0646a;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                m6 = new M(this, interfaceC0617c);
                Object obj22 = m6.f3886g;
                i4 = m6.f3887h;
                if (i4 == 0) {
                }
                return Z5.y.f7506a;
            default:
                if (interfaceC0617c instanceof Y) {
                    y4 = (Y) interfaceC0617c;
                    int i10 = y4.f3919h;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        y4.f3919h = i10 - Integer.MIN_VALUE;
                        Object obj3 = y4.f3918g;
                        i8 = y4.f3919h;
                        if (i8 == 0) {
                            if (i8 == 1) {
                                Z5.a.d(obj3);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj3);
                            boolean z8 = ((f2.f) obj).f10704f;
                            a0 a0Var = this.f3891f;
                            if (z8) {
                                dVar = a0Var.f3935o;
                            } else if (!z8) {
                                dVar = a0Var.f3934n;
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                            y4.f3919h = 1;
                            Object n8 = this.f3890e.n(dVar, y4);
                            EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
                            if (n8 == enumC0646a2) {
                                return enumC0646a2;
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                y4 = new Y(this, interfaceC0617c);
                Object obj32 = y4.f3918g;
                i8 = y4.f3919h;
                if (i8 == 0) {
                }
                return Z5.y.f7506a;
        }
    }
}
