package J1;

import Z5.y;
import android.content.DialogInterface;
import android.util.Log;
import androidx.lifecycle.C0512x;
import androidx.lifecycle.EnumC0504o;
import androidx.lifecycle.InterfaceC0509u;
import androidx.lifecycle.InterfaceC0510v;
import com.buzbuz.smartautoclicker.R;
import g0.AbstractComponentCallbacksC0755y;
import g0.d0;
import i.AbstractActivityC0870i;
import i.C0865d;
import java.util.ArrayList;
import java.util.Iterator;
import n0.C1131i;
import n6.InterfaceC1162a;
import n6.InterfaceC1163b;
import o6.j;
import p0.C1299g;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2349d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2350e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2351f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2352g;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i4) {
        this.f2349d = i4;
        this.f2350e = obj;
        this.f2351f = obj2;
        this.f2352g = obj3;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [J1.d] */
    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        switch (this.f2349d) {
            case 0:
                L1.b bVar = (L1.b) this.f2350e;
                final e eVar = (e) this.f2351f;
                AbstractActivityC0870i abstractActivityC0870i = (AbstractActivityC0870i) this.f2352g;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Log.i("PermissionsController", "onPermissionDialogResult: " + bVar + " isGranted=" + booleanValue);
                if (!booleanValue && !bVar.f2756a) {
                    s5.b bVar2 = new s5.b(abstractActivityC0870i);
                    C0865d c0865d = (C0865d) bVar2.f3288e;
                    bVar2.l(R.string.dialog_title_permission_mandatory_denied);
                    c0865d.f11665f = c0865d.f11660a.getText(R.string.message_permission_mandatory_denied);
                    bVar2.k(android.R.string.ok, new c(0, eVar));
                    c0865d.f11669l = new DialogInterface.OnCancelListener() { // from class: J1.d
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            e eVar2 = e.this;
                            InterfaceC1162a interfaceC1162a = eVar2.f2362e;
                            if (interfaceC1162a != null) {
                                interfaceC1162a.a();
                            }
                            eVar2.f2361d = null;
                            eVar2.f2362e = null;
                            eVar2.f2359b.g(null);
                            eVar2.f2358a.clear();
                        }
                    };
                    bVar2.c().show();
                } else {
                    eVar.a(abstractActivityC0870i);
                }
                return y.f7506a;
            default:
                C1299g c1299g = (C1299g) this.f2350e;
                AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = (AbstractComponentCallbacksC0755y) this.f2351f;
                C1131i c1131i = (C1131i) this.f2352g;
                InterfaceC0510v interfaceC0510v = (InterfaceC0510v) obj;
                ArrayList arrayList = c1299g.f13666g;
                boolean z8 = false;
                if (arrayList == null || !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (j.a(((Z5.j) it.next()).f7485d, abstractComponentCallbacksC0755y.f11088D)) {
                                z8 = true;
                            }
                        }
                    }
                }
                if (interfaceC0510v != null && !z8) {
                    d0 o7 = abstractComponentCallbacksC0755y.o();
                    o7.c();
                    C0512x c0512x = o7.f11009h;
                    if (c0512x.f8862d.compareTo(EnumC0504o.f8848f) >= 0) {
                        c0512x.a((InterfaceC0509u) c1299g.f13668i.m(c1131i));
                    }
                }
                return y.f7506a;
        }
    }
}
