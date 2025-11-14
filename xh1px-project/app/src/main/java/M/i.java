package M;

import Q.q;
import a8.o;
import a8.u;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import b8.p;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0711a;
import i.C0864c;
import i.C0865d;
import i.C0868g;
import i.DialogInterfaceC0869h;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import o6.y;
import u0.r;
import x0.C1772a;

/* loaded from: classes.dex */
public class i implements q {

    /* renamed from: d, reason: collision with root package name */
    public int f3287d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3288e;

    public /* synthetic */ i(int i4, Object obj) {
        this.f3288e = obj;
        this.f3287d = i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(i iVar, Z5.b bVar, AbstractC0711a abstractC0711a) {
        b8.q qVar;
        int i4;
        LinkedHashMap linkedHashMap;
        Z5.b bVar2;
        byte b4;
        S6.e eVar;
        i iVar2;
        S6.e eVar2 = (S6.e) iVar.f3288e;
        if (abstractC0711a instanceof b8.q) {
            qVar = (b8.q) abstractC0711a;
            int i8 = qVar.f9286n;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                qVar.f9286n = i8 - Integer.MIN_VALUE;
                Object obj = qVar.f9284l;
                i4 = qVar.f9286n;
                int i9 = 0;
                if (i4 == 0) {
                    if (i4 == 1) {
                        int i10 = qVar.k;
                        String str = qVar.j;
                        linkedHashMap = qVar.f9283i;
                        iVar2 = qVar.f9282h;
                        bVar2 = qVar.f9281g;
                        Z5.a.d(obj);
                        linkedHashMap.put(str, (a8.j) obj);
                        b4 = ((S6.e) iVar2.f3288e).h();
                        if (b4 != 4) {
                            if (b4 != 7) {
                                S6.e.q((S6.e) iVar2.f3288e, "Expected end of the object or comma", 0, null, 6);
                                throw null;
                            }
                            S6.e eVar3 = (S6.e) iVar2.f3288e;
                            if (b4 != 6) {
                                eVar3.i((byte) 7);
                            } else if (b4 == 4) {
                                b8.j.m(eVar3, "object");
                                throw null;
                            }
                            return new u(linkedHashMap);
                        }
                        i9 = i10;
                        iVar = iVar2;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Z5.a.d(obj);
                    byte i11 = eVar2.i((byte) 6);
                    if (eVar2.z() != 4) {
                        linkedHashMap = new LinkedHashMap();
                        bVar2 = bVar;
                        b4 = i11;
                    } else {
                        S6.e.q(eVar2, "Unexpected leading comma", 0, null, 6);
                        throw null;
                    }
                }
                eVar = (S6.e) iVar.f3288e;
                if (!eVar.e()) {
                    String l6 = eVar.l();
                    eVar.i((byte) 5);
                    qVar.f9281g = bVar2;
                    qVar.f9282h = iVar;
                    qVar.f9283i = linkedHashMap;
                    qVar.j = l6;
                    qVar.k = i9;
                    qVar.f9286n = 1;
                    bVar2.getClass();
                    bVar2.f7473e = qVar;
                    return EnumC0646a.f10656d;
                }
                iVar2 = iVar;
                S6.e eVar32 = (S6.e) iVar2.f3288e;
                if (b4 != 6) {
                }
                return new u(linkedHashMap);
            }
        }
        qVar = new b8.q(iVar, abstractC0711a);
        Object obj2 = qVar.f9284l;
        i4 = qVar.f9286n;
        int i92 = 0;
        if (i4 == 0) {
        }
        eVar = (S6.e) iVar.f3288e;
        if (!eVar.e()) {
        }
    }

    public static void d(String str) {
        int i4;
        boolean z8;
        if (!str.equalsIgnoreCase(":memory:")) {
            int length = str.length() - 1;
            int i8 = 0;
            boolean z9 = false;
            while (i8 <= length) {
                if (!z9) {
                    i4 = i8;
                } else {
                    i4 = length;
                }
                if (o6.j.f(str.charAt(i4), 32) <= 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (!z9) {
                    if (!z8) {
                        z9 = true;
                    } else {
                        i8++;
                    }
                } else if (!z8) {
                    break;
                } else {
                    length--;
                }
            }
            if (str.subSequence(i8, length + 1).toString().length() != 0) {
                Log.w("SupportSQLite", "deleting the database file: ".concat(str));
                try {
                    SQLiteDatabase.deleteDatabase(new File(str));
                } catch (Exception e9) {
                    Log.w("SupportSQLite", "delete failed: ", e9);
                }
            }
        }
    }

    @Override // Q.q
    public boolean a(View view) {
        ((BottomSheetBehavior) this.f3288e).I(this.f3287d);
        return true;
    }

    public DialogInterfaceC0869h c() {
        int i4;
        C0865d c0865d = (C0865d) this.f3288e;
        DialogInterfaceC0869h dialogInterfaceC0869h = new DialogInterfaceC0869h(c0865d.f11660a, this.f3287d);
        View view = c0865d.f11664e;
        C0868g c0868g = dialogInterfaceC0869h.f11708i;
        if (view != null) {
            c0868g.f11704w = view;
        } else {
            CharSequence charSequence = c0865d.f11663d;
            if (charSequence != null) {
                c0868g.f11687d = charSequence;
                TextView textView = c0868g.f11702u;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c0865d.f11662c;
            if (drawable != null) {
                c0868g.f11700s = drawable;
                ImageView imageView = c0868g.f11701t;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c0868g.f11701t.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = c0865d.f11665f;
        if (charSequence2 != null) {
            c0868g.f11688e = charSequence2;
            TextView textView2 = c0868g.f11703v;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = c0865d.f11666g;
        if (charSequence3 != null) {
            c0868g.c(-1, charSequence3, c0865d.f11667h);
        }
        CharSequence charSequence4 = c0865d.f11668i;
        if (charSequence4 != null) {
            c0868g.c(-2, charSequence4, c0865d.j);
        }
        if (c0865d.f11672o != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0865d.f11661b.inflate(c0868g.f11678A, (ViewGroup) null);
            if (c0865d.f11675r) {
                i4 = c0868g.f11679B;
            } else {
                i4 = c0868g.f11680C;
            }
            ListAdapter listAdapter = c0865d.f11672o;
            if (listAdapter == null) {
                listAdapter = new ArrayAdapter(c0865d.f11660a, i4, R.id.text1, (Object[]) null);
            }
            c0868g.f11705x = listAdapter;
            c0868g.f11706y = c0865d.f11676s;
            if (c0865d.f11673p != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0864c(c0865d, c0868g));
            }
            if (c0865d.f11675r) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c0868g.f11689f = alertController$RecycleListView;
        }
        View view2 = c0865d.f11674q;
        if (view2 != null) {
            c0868g.f11690g = view2;
            c0868g.f11691h = false;
        }
        dialogInterfaceC0869h.setCancelable(c0865d.k);
        if (c0865d.k) {
            dialogInterfaceC0869h.setCanceledOnTouchOutside(true);
        }
        dialogInterfaceC0869h.setOnCancelListener(c0865d.f11669l);
        dialogInterfaceC0869h.setOnDismissListener(c0865d.f11670m);
        DialogInterface.OnKeyListener onKeyListener = c0865d.f11671n;
        if (onKeyListener != null) {
            dialogInterfaceC0869h.setOnKeyListener(onKeyListener);
        }
        return dialogInterfaceC0869h;
    }

    public boolean e() {
        if (((Z0.a) this.f3288e) != null) {
            return true;
        }
        return false;
    }

    public void f(F0.c cVar, int i4, int i8) {
        ((r) this.f3288e).e(new C1772a(cVar), i4, i8);
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [Z5.b, d6.c, java.lang.Object] */
    public a8.j g() {
        a8.j uVar;
        Object obj;
        S6.e eVar = (S6.e) this.f3288e;
        byte z8 = eVar.z();
        if (z8 == 1) {
            return i(true);
        }
        if (z8 == 0) {
            return i(false);
        }
        if (z8 == 6) {
            int i4 = this.f3287d + 1;
            this.f3287d = i4;
            if (i4 == 200) {
                p pVar = new p(this, null);
                ?? obj2 = new Object();
                obj2.f7472d = pVar;
                obj2.f7473e = obj2;
                EnumC0646a enumC0646a = Z5.a.f7471a;
                obj2.f7474f = enumC0646a;
                while (true) {
                    obj = obj2.f7474f;
                    InterfaceC0617c interfaceC0617c = obj2.f7473e;
                    if (interfaceC0617c == null) {
                        break;
                    }
                    if (o6.j.a(enumC0646a, obj)) {
                        try {
                            p pVar2 = obj2.f7472d;
                            y.c(3, pVar2);
                            p pVar3 = new p(pVar2.f9280h, interfaceC0617c);
                            pVar3.f9279g = obj2;
                            Object v8 = pVar3.v(Z5.y.f7506a);
                            if (v8 != EnumC0646a.f10656d) {
                                interfaceC0617c.k(v8);
                            }
                        } catch (Throwable th) {
                            interfaceC0617c.k(Z5.a.b(th));
                        }
                    } else {
                        obj2.f7474f = enumC0646a;
                        interfaceC0617c.k(obj);
                    }
                }
                Z5.a.d(obj);
                uVar = (a8.j) obj;
            } else {
                byte i8 = eVar.i((byte) 6);
                if (eVar.z() != 4) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    while (true) {
                        if (!eVar.e()) {
                            break;
                        }
                        String l6 = eVar.l();
                        eVar.i((byte) 5);
                        linkedHashMap.put(l6, g());
                        i8 = eVar.h();
                        if (i8 != 4) {
                            if (i8 != 7) {
                                S6.e.q(eVar, "Expected end of the object or comma", 0, null, 6);
                                throw null;
                            }
                        }
                    }
                    if (i8 == 6) {
                        eVar.i((byte) 7);
                    } else if (i8 == 4) {
                        b8.j.m(eVar, "object");
                        throw null;
                    }
                    uVar = new u(linkedHashMap);
                } else {
                    S6.e.q(eVar, "Unexpected leading comma", 0, null, 6);
                    throw null;
                }
            }
            this.f3287d--;
            return uVar;
        }
        if (z8 == 8) {
            return h();
        }
        S6.e.q(eVar, "Cannot read Json element because of unexpected ".concat(b8.j.r(z8)), 0, null, 6);
        throw null;
    }

    public a8.d h() {
        boolean z8;
        S6.e eVar = (S6.e) this.f3288e;
        byte h8 = eVar.h();
        if (eVar.z() != 4) {
            ArrayList arrayList = new ArrayList();
            while (eVar.e()) {
                arrayList.add(g());
                h8 = eVar.h();
                if (h8 != 4) {
                    if (h8 == 9) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    int i4 = eVar.f5429b;
                    if (!z8) {
                        S6.e.q(eVar, "Expected end of the array or comma", i4, null, 4);
                        throw null;
                    }
                }
            }
            if (h8 == 8) {
                eVar.i((byte) 9);
            } else if (h8 == 4) {
                b8.j.m(eVar, "array");
                throw null;
            }
            return new a8.d(arrayList);
        }
        S6.e.q(eVar, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    public a8.y i(boolean z8) {
        String l6;
        S6.e eVar = (S6.e) this.f3288e;
        if (!z8) {
            l6 = eVar.m();
        } else {
            l6 = eVar.l();
        }
        if (!z8 && o6.j.a(l6, "null")) {
            return a8.r.INSTANCE;
        }
        return new o(l6, z8);
    }

    public i(r rVar, int i4) {
        this.f3288e = rVar;
        this.f3287d = i4;
    }

    public i(Context context) {
        this(context, DialogInterfaceC0869h.h(context, 0));
    }

    public i(Context context, int i4) {
        this.f3288e = new C0865d(new ContextThemeWrapper(context, DialogInterfaceC0869h.h(context, i4)));
        this.f3287d = i4;
    }

    public i(int i4, boolean z8) {
        switch (i4) {
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                this.f3287d = 255;
                this.f3288e = null;
                return;
            default:
                this.f3287d = 1;
                this.f3288e = Collections.singletonList(null);
                return;
        }
    }
}
