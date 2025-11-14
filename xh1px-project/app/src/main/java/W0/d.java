package W0;

import A5.n;
import B6.r;
import C1.e;
import C6.InterfaceC0004e;
import C6.InterfaceC0007h;
import D2.f;
import D4.C0040p;
import L3.E;
import N0.C;
import N0.o;
import O3.J;
import O7.C0228a;
import O7.C0242o;
import O7.InterfaceC0233f;
import O7.InterfaceC0234g;
import O7.L;
import P.InterfaceC0257e;
import P7.u;
import P7.y;
import Q.g;
import Q.h;
import Q7.q;
import T3.x;
import T6.i;
import android.content.ClipData;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.button.MaterialButton;
import d6.InterfaceC0617c;
import d6.InterfaceC0622h;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import n.k;
import n.m;
import n6.InterfaceC1164c;
import o.T0;
import o6.j;
import t7.C1594d;
import w7.AbstractC1759v;

/* loaded from: classes.dex */
public class d implements k, F7.a, InterfaceC0233f, M0.a, InterfaceC0257e, T0 {

    /* renamed from: f, reason: collision with root package name */
    public static d f6487f;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6488d;

    /* renamed from: e, reason: collision with root package name */
    public Object f6489e;

    public /* synthetic */ d(int i4, Object obj) {
        this.f6488d = i4;
        this.f6489e = obj;
    }

    public static String e(Context context) {
        j.e(context, "context");
        String string = context.getString(R.string.default_condition_name);
        j.d(string, "getString(...)");
        return string;
    }

    @Override // P.InterfaceC0257e
    public ClipData a() {
        ClipData clip;
        clip = ((ContentInfo) this.f6489e).getClip();
        return clip;
    }

    @Override // F7.a
    public Iterable b(Object obj) {
        InterfaceC0007h interfaceC0007h;
        InterfaceC0004e interfaceC0004e;
        r rVar = (r) this.f6489e;
        Collection d2 = ((InterfaceC0004e) obj).B().d();
        j.d(d2, "getSupertypes(...)");
        ArrayList arrayList = new ArrayList();
        Iterator it = d2.iterator();
        while (it.hasNext()) {
            InterfaceC0007h c6 = ((AbstractC1759v) it.next()).B0().c();
            i iVar = null;
            if (c6 != null) {
                interfaceC0007h = c6.a();
            } else {
                interfaceC0007h = null;
            }
            if (interfaceC0007h instanceof InterfaceC0004e) {
                interfaceC0004e = (InterfaceC0004e) interfaceC0007h;
            } else {
                interfaceC0004e = null;
            }
            if (interfaceC0004e != null && (iVar = rVar.f(interfaceC0004e)) == null) {
                iVar = interfaceC0004e;
            }
            if (iVar != null) {
                arrayList.add(iVar);
            }
        }
        return arrayList;
    }

    @Override // P.InterfaceC0257e
    public int c() {
        int flags;
        flags = ((ContentInfo) this.f6489e).getFlags();
        return flags;
    }

    @Override // P.InterfaceC0257e
    public ContentInfo d() {
        return (ContentInfo) this.f6489e;
    }

    public g f(int i4) {
        return null;
    }

    public g g(int i4) {
        return null;
    }

    @Override // M0.a
    public View getRoot() {
        return (LinearLayout) this.f6489e;
    }

    @Override // P.InterfaceC0257e
    public int h() {
        int source;
        source = ((ContentInfo) this.f6489e).getSource();
        return source;
    }

    public C i(Context context, String str, InputStream inputStream, String str2, String str3) {
        C g8;
        C c6;
        b bVar;
        c cVar = (c) this.f6489e;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (!str2.contains("application/zip") && !str2.contains("application/x-zip") && !str2.contains("application/x-zip-compressed") && !str.split("\\?")[0].endsWith(".lottie")) {
            if (!str2.contains("application/gzip") && !str2.contains("application/x-gzip") && !str.split("\\?")[0].endsWith(".tgs")) {
                Z0.c.a();
                bVar = b.f6480e;
                if (str3 != null) {
                    c6 = o.d(new FileInputStream(cVar.q(str, inputStream, bVar).getAbsolutePath()), str);
                } else {
                    c6 = o.d(inputStream, null);
                }
            } else {
                Z0.c.a();
                bVar = b.f6482g;
                if (str3 != null) {
                    c6 = o.d(new GZIPInputStream(new FileInputStream(cVar.q(str, inputStream, bVar))), str);
                } else {
                    c6 = o.d(new GZIPInputStream(inputStream), null);
                }
            }
        } else {
            Z0.c.a();
            b bVar2 = b.f6481f;
            if (str3 != null) {
                g8 = o.g(context, new ZipInputStream(new FileInputStream(cVar.q(str, inputStream, bVar2))), str);
            } else {
                g8 = o.g(context, new ZipInputStream(inputStream), null);
            }
            c6 = g8;
            bVar = bVar2;
        }
        if (str3 != null && c6.f3564a != null) {
            File file = new File(cVar.p(), c.j(str, bVar, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean renameTo = file.renameTo(file2);
            file2.toString();
            Z0.c.a();
            if (!renameTo) {
                Z0.c.b("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
            }
        }
        return c6;
    }

    public boolean j(int i4, int i8, Bundle bundle) {
        return false;
    }

    public String toString() {
        switch (this.f6488d) {
            case 21:
                return "ContentInfoCompat{" + ((ContentInfo) this.f6489e) + "}";
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009c  */
    /* JADX WARN: Type inference failed for: r6v22, types: [f6.j, n6.c] */
    @Override // O7.InterfaceC0233f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object x(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        C0228a c0228a;
        int i4;
        Throwable th;
        y yVar;
        switch (this.f6488d) {
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                Object x8 = ((L) this.f6489e).x(new e(interfaceC0234g, 16), interfaceC0617c);
                if (x8 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x8;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 16:
            case 17:
            case 21:
            case 23:
            case 24:
            case 26:
            default:
                Object x9 = ((C0040p) this.f6489e).x(new x(interfaceC0234g, 18), interfaceC0617c);
                if (x9 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x9;
            case 10:
                Object x10 = ((C4.e) this.f6489e).x(new e(interfaceC0234g, 25), interfaceC0617c);
                if (x10 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x10;
            case 11:
                Object x11 = ((L3.C) this.f6489e).x(new e(interfaceC0234g, 27), interfaceC0617c);
                if (x11 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x11;
            case 12:
                Object x12 = ((d) this.f6489e).x(new E(interfaceC0234g, 0), interfaceC0617c);
                if (x12 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x12;
            case 13:
                Object x13 = ((C0040p) this.f6489e).x(new E(interfaceC0234g, 14), interfaceC0617c);
                if (x13 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x13;
            case 14:
                Object x14 = ((c) this.f6489e).x(new E(interfaceC0234g, 16), interfaceC0617c);
                if (x14 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x14;
            case 15:
                Object x15 = ((C0040p) this.f6489e).x(new E(interfaceC0234g, 20), interfaceC0617c);
                if (x15 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x15;
            case 18:
                Object x16 = ((C0040p) this.f6489e).x(new J(interfaceC0234g, 0), interfaceC0617c);
                if (x16 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x16;
            case 19:
                Object x17 = ((C4.e) this.f6489e).x(new J(interfaceC0234g, 14), interfaceC0617c);
                if (x17 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x17;
            case 20:
                if (interfaceC0617c instanceof C0228a) {
                    c0228a = (C0228a) interfaceC0617c;
                    int i8 = c0228a.j;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        c0228a.j = i8 - Integer.MIN_VALUE;
                        Object obj = c0228a.f4120h;
                        i4 = c0228a.j;
                        Z5.y yVar2 = Z5.y.f7506a;
                        if (i4 == 0) {
                            if (i4 == 1) {
                                yVar = c0228a.f4119g;
                                try {
                                    Z5.a.d(obj);
                                } catch (Throwable th2) {
                                    th = th2;
                                    yVar.w();
                                    throw th;
                                }
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj);
                            InterfaceC0622h interfaceC0622h = c0228a.f10782e;
                            j.b(interfaceC0622h);
                            y yVar3 = new y(interfaceC0234g, interfaceC0622h);
                            try {
                                c0228a.f4119g = yVar3;
                                c0228a.j = 1;
                                Object l6 = ((AbstractC0720j) this.f6489e).l(yVar3, c0228a);
                                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                                if (l6 != enumC0646a) {
                                    l6 = yVar2;
                                }
                                if (l6 == enumC0646a) {
                                    return enumC0646a;
                                }
                                yVar = yVar3;
                            } catch (Throwable th3) {
                                th = th3;
                                yVar = yVar3;
                                yVar.w();
                                throw th;
                            }
                        }
                        yVar.w();
                        return yVar2;
                    }
                }
                c0228a = new C0228a(this, interfaceC0617c);
                Object obj2 = c0228a.f4120h;
                i4 = c0228a.j;
                Z5.y yVar22 = Z5.y.f7506a;
                if (i4 == 0) {
                }
                yVar.w();
                return yVar22;
            case 22:
                u uVar = new u((C0242o) this.f6489e, interfaceC0234g, null);
                q qVar = new q(interfaceC0617c, interfaceC0617c.h());
                Object L8 = f.L(qVar, true, qVar, uVar);
                if (L8 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return L8;
            case 25:
                Object x18 = ((C0040p) this.f6489e).x(new x(interfaceC0234g, 0), interfaceC0617c);
                if (x18 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x18;
            case 27:
                Object x19 = ((c) this.f6489e).x(new x(interfaceC0234g, 11), interfaceC0617c);
                if (x19 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x19;
        }
    }

    @Override // n.k
    public boolean z(m mVar, MenuItem menuItem) {
        A5.q qVar = (A5.q) this.f6489e;
        qVar.getClass();
        n nVar = qVar.f386h;
        if (nVar != null) {
            B1.c cVar = (B1.c) ((B1.b) nVar).f423e;
            j.e(menuItem, "item");
            cVar.P(menuItem.getItemId(), false);
        }
        return false;
    }

    public /* synthetic */ d(int i4, boolean z8) {
        this.f6488d = i4;
    }

    public d(c cVar, C1594d c1594d) {
        this.f6488d = 0;
        this.f6489e = cVar;
    }

    public d(b2.r rVar) {
        this.f6488d = 6;
        j.e(rVar, "scenarioRepository");
        this.f6489e = rVar;
    }

    public d(LinearLayout linearLayout, MaterialButton materialButton, MaterialButton materialButton2) {
        this.f6488d = 17;
        this.f6489e = linearLayout;
    }

    public d(int i4) {
        this.f6488d = i4;
        switch (i4) {
            case 16:
                this.f6489e = new HashSet();
                return;
            case 23:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f6489e = new h(this);
                    return;
                } else {
                    this.f6489e = new h(this);
                    return;
                }
            default:
                this.f6489e = new Object();
                new Handler(Looper.getMainLooper(), new J5.e(this));
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(InterfaceC1164c interfaceC1164c) {
        this.f6488d = 20;
        this.f6489e = (AbstractC0720j) interfaceC1164c;
    }

    public d(ContentInfo contentInfo) {
        this.f6488d = 21;
        contentInfo.getClass();
        this.f6489e = D5.e.j(contentInfo);
    }

    @Override // n.k
    public void A(m mVar) {
    }
}
