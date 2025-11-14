package i;

import C6.InterfaceC0002c;
import C6.h0;
import L7.AbstractC0166y;
import L7.C0150h;
import O7.C0238k;
import a6.AbstractC0438m;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import b6.C0533a;
import b6.C0535c;
import com.buzbuz.smartautoclicker.R;
import d6.InterfaceC0619e;
import d6.InterfaceC0622h;
import f6.AbstractC0713c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.RejectedExecutionException;
import k3.C0965l;
import l1.C0999a;
import m1.InterfaceC1053c;
import n.RunnableC1108e;
import n0.C1146x;
import n6.InterfaceC1162a;
import n6.InterfaceC1163b;
import o.m1;
import o.o1;
import p2.C1304a;
import p7.C1319a;
import p7.C1329k;
import p7.C1332n;
import p7.InterfaceC1333o;
import q4.X;
import w6.s0;
import w7.AbstractC1759v;

/* renamed from: i.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0862a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f11657a = 0;

    public static final Object A(u0.u uVar, InterfaceC1163b interfaceC1163b, AbstractC0713c abstractC0713c) {
        InterfaceC0619e interfaceC0619e;
        ExecutorC0875n executorC0875n;
        u0.w wVar = new u0.w(new C0238k(uVar, interfaceC1163b, null), null);
        u0.x xVar = (u0.x) abstractC0713c.h().B(u0.x.f15289f);
        if (xVar != null) {
            interfaceC0619e = xVar.f15290d;
        } else {
            interfaceC0619e = null;
        }
        if (interfaceC0619e != null) {
            return AbstractC0166y.A(interfaceC0619e, wVar, abstractC0713c);
        }
        InterfaceC0622h h8 = abstractC0713c.h();
        C0150h c0150h = new C0150h(1, E2.c.d0(abstractC0713c));
        c0150h.v();
        try {
            executorC0875n = uVar.f15278d;
        } catch (RejectedExecutionException e9) {
            c0150h.p(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e9));
        }
        if (executorC0875n != null) {
            executorC0875n.execute(new RunnableC1108e(h8, c0150h, uVar, wVar));
            return c0150h.u();
        }
        o6.j.i("internalTransactionExecutor");
        throw null;
    }

    public static final boolean c(C0535c c0535c, C0999a c0999a) {
        Object obj;
        o6.j.e(c0999a, "id");
        ListIterator listIterator = c0535c.listIterator(0);
        while (true) {
            C0533a c0533a = (C0533a) listIterator;
            if (c0533a.hasNext()) {
                obj = c0533a.next();
                if (o6.j.a(((InterfaceC1053c) obj).getId(), c0999a)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj == null) {
            return false;
        }
        return true;
    }

    public static InterfaceC1333o d(String str, Collection collection) {
        InterfaceC1333o interfaceC1333o;
        o6.j.e(str, "message");
        o6.j.e(collection, "types");
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC1759v) it.next()).w0());
        }
        F7.f C8 = X.C(arrayList);
        int i4 = C8.f1624d;
        if (i4 != 0) {
            if (i4 != 1) {
                interfaceC1333o = new C1319a(str, (InterfaceC1333o[]) C8.toArray(new InterfaceC1333o[0]));
            } else {
                interfaceC1333o = (InterfaceC1333o) C8.get(0);
            }
        } else {
            interfaceC1333o = C1332n.f13842b;
        }
        if (C8.f1624d <= 1) {
            return interfaceC1333o;
        }
        return new C1329k(interfaceC1333o);
    }

    public static final C1146x f(View view) {
        o6.j.e(view, "view");
        C1146x c1146x = (C1146x) H7.m.R(H7.m.X(H7.m.T(view, new H7.o(28)), new H7.o(29)));
        if (c1146x != null) {
            return c1146x;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    public static final String h(p2.f fVar, Context context) {
        if (fVar.b()) {
            String string = context.getString(R.string.item_desc_dumb_repeat_infinite);
            o6.j.d(string, "getString(...)");
            return string;
        }
        String string2 = context.getString(R.string.item_desc_dumb_repeat_count, Integer.valueOf(fVar.e()));
        o6.j.d(string2, "getString(...)");
        return string2;
    }

    public static final Object j(v7.l lVar, u6.s sVar) {
        o6.j.e(lVar, "<this>");
        o6.j.e(sVar, "p");
        return lVar.a();
    }

    public static s0 l(InterfaceC0002c interfaceC0002c, InterfaceC1162a interfaceC1162a) {
        if (interfaceC1162a != null) {
            return new s0(interfaceC0002c, interfaceC1162a);
        }
        throw new IllegalArgumentException("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties.lazySoft must not be null");
    }

    public static final boolean r(Context context, Intent intent) {
        o6.j.e(intent, "intent");
        try {
            context.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException unused) {
            Log.e("ContextExt", "No activity found to handle startActivity with " + intent + ".");
            return false;
        } catch (SecurityException unused2) {
            Log.e("ContextExt", "Not allowed to startActivity with " + intent + ".");
            return false;
        } catch (Exception unused3) {
            Log.e("ContextExt", "Error while startActivity with " + intent);
            return false;
        }
    }

    public static void w(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            m1.a(view, charSequence);
            return;
        }
        o1 o1Var = o1.f13332n;
        if (o1Var != null && o1Var.f13334d == view) {
            o1.b(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            o1 o1Var2 = o1.f13333o;
            if (o1Var2 != null && o1Var2.f13334d == view) {
                o1Var2.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new o1(view, charSequence);
    }

    public static C0965l z(p2.d dVar, Context context, int i4) {
        boolean z8;
        String string;
        String string2;
        String string3;
        if ((i4 & 2) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        boolean h8 = dVar.h();
        boolean z9 = !h8;
        o6.j.e(dVar, "<this>");
        if (dVar instanceof C1304a) {
            C1304a c1304a = (C1304a) dVar;
            String str = c1304a.f13678c;
            Point point = c1304a.f13683h;
            long j = c1304a.f13684i;
            if (!h8) {
                string3 = context.getString(R.string.item_error_action_invalid_generic);
            } else if (z8) {
                string3 = context.getString(R.string.item_desc_dumb_click_details, D2.f.o(j), Integer.valueOf(point.x), Integer.valueOf(point.y));
            } else {
                string3 = context.getString(R.string.item_desc_dumb_action_duration, D2.f.o(j));
            }
            String str2 = string3;
            o6.j.b(str2);
            return new C0965l(R.drawable.ic_click, str, str2, h(c1304a, context), z9, c1304a);
        }
        if (dVar instanceof p2.c) {
            p2.c cVar = (p2.c) dVar;
            String str3 = cVar.f13692c;
            Point point2 = cVar.f13698i;
            Point point3 = cVar.f13697h;
            long j5 = cVar.j;
            if (!h8) {
                string2 = context.getString(R.string.item_error_action_invalid_generic);
            } else if (z8) {
                string2 = context.getString(R.string.item_desc_dumb_swipe_details, D2.f.o(j5), Integer.valueOf(point3.x), Integer.valueOf(point3.y), Integer.valueOf(point2.x), Integer.valueOf(point2.y));
            } else {
                string2 = context.getString(R.string.item_desc_dumb_action_duration, D2.f.o(j5));
            }
            String str4 = string2;
            o6.j.b(str4);
            return new C0965l(R.drawable.ic_swipe, str3, str4, h(cVar, context), z9, cVar);
        }
        if (dVar instanceof p2.b) {
            p2.b bVar = (p2.b) dVar;
            String str5 = bVar.f13687c;
            long j8 = bVar.f13689e;
            if (!h8) {
                string = context.getString(R.string.item_error_action_invalid_generic);
            } else if (z8) {
                string = context.getString(R.string.item_desc_dumb_pause_details, D2.f.o(j8));
            } else {
                string = context.getString(R.string.item_desc_dumb_action_duration, D2.f.o(j8));
            }
            String str6 = string;
            o6.j.b(str6);
            return new C0965l(R.drawable.ic_wait, str5, str6, null, z9, bVar);
        }
        throw new IllegalArgumentException("Not yet supported");
    }

    public boolean a() {
        return false;
    }

    public abstract boolean b();

    public abstract void e(boolean z8);

    public abstract int g();

    public abstract Context i();

    public boolean k() {
        return false;
    }

    public abstract void m();

    public abstract boolean o(int i4, KeyEvent keyEvent);

    public boolean p(KeyEvent keyEvent) {
        return false;
    }

    public boolean q() {
        return false;
    }

    public abstract void s(boolean z8);

    public abstract void t(boolean z8);

    public abstract void u();

    public abstract void v(boolean z8);

    public abstract void x(CharSequence charSequence);

    public h0 y(R3.r rVar) {
        return null;
    }

    public void n() {
    }
}
