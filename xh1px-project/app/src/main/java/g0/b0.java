package g0;

import L7.AbstractC0166y;
import a7.C0450k;
import android.accessibilityservice.GestureDescription;
import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Path;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.C0512x;
import b6.C0536d;
import b6.C0538f;
import b6.C0539g;
import b7.C0542a;
import com.buzbuz.smartautoclicker.R;
import e2.AbstractC0640c;
import e2.C0638a;
import e2.C0639b;
import e6.EnumC0646a;
import f6.AbstractC0713c;
import f7.C0722b;
import g2.C0777a;
import h6.AbstractC0837b;
import i2.C0880a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k0.AbstractC0948c;
import k0.C0949d;
import k2.AbstractC0951a;
import k2.C0952b;
import kotlin.NoWhenBranchMatchedException;
import l1.C0999a;
import m.C1041d;
import n.MenuC1100B;
import n6.InterfaceC1162a;
import n6.InterfaceC1163b;
import n6.InterfaceC1164c;
import r1.C1428b;
import r6.C1474e;
import s2.AbstractC1480a;
import s2.C1481b;
import s2.C1482c;
import s2.C1483d;
import s2.C1484e;
import s2.C1485f;
import s2.C1486g;
import s2.C1487h;
import s2.C1488i;
import s7.C1507A;
import s7.C1513d;
import s7.InterfaceC1514e;
import t0.C1536c;
import t1.C1560a;
import t1.C1561b;
import t7.C1594d;
import u1.C1626a;
import u1.C1628c;
import u1.C1629d;
import u6.InterfaceC1642c;
import v2.InterfaceC1661a;

/* loaded from: classes.dex */
public final class b0 implements InterfaceC1514e, M0.a {

    /* renamed from: d, reason: collision with root package name */
    public Object f10987d;

    /* renamed from: e, reason: collision with root package name */
    public Object f10988e;

    /* renamed from: f, reason: collision with root package name */
    public Object f10989f;

    /* renamed from: g, reason: collision with root package name */
    public Object f10990g;

    public b0(b0 b0Var, C6.S s8, List list, Map map) {
        this.f10987d = b0Var;
        this.f10988e = s8;
        this.f10989f = list;
        this.f10990g = map;
    }

    public void a(AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y) {
        if (!((ArrayList) this.f10987d).contains(abstractComponentCallbacksC0755y)) {
            synchronized (((ArrayList) this.f10987d)) {
                ((ArrayList) this.f10987d).add(abstractComponentCallbacksC0755y);
            }
            abstractComponentCallbacksC0755y.f11118n = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0755y);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0151, code lost:
    
        if (r11 == r13) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x015c, code lost:
    
        r6 = r6;
        r5 = r5;
        r9 = r9;
        r8 = r8;
        r24 = r2;
        r11 = r3;
        r25 = r4;
        r1 = r1;
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01b6, code lost:
    
        if (r11 != r13) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01eb, code lost:
    
        if (r11 == r13) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0204, code lost:
    
        if (r0.d((f2.f) r10, r6) == r13) goto L62;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x002c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:277:0x06c4 -> B:12:0x06c9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(AbstractC0951a abstractC0951a, s2.k kVar, AbstractC0713c abstractC0713c) {
        C1481b c1481b;
        Iterator it;
        C1481b c1481b2;
        int i4;
        AbstractC0951a abstractC0951a2;
        s2.k kVar2;
        C1474e c1474e;
        b0 b0Var;
        C1536c c1536c;
        b0 b0Var2;
        int i8;
        Iterator it2;
        s2.k kVar3;
        AbstractC0951a abstractC0951a3;
        b0 b0Var3;
        boolean hasNext;
        AbstractC0951a abstractC0951a4;
        Iterator it3;
        s2.k kVar4;
        int i9;
        int i10;
        Object obj;
        String str;
        String str2;
        String str3;
        E.j jVar;
        b0 b0Var4;
        int i11;
        C1560a c1560a;
        int i12;
        int i13;
        int i14;
        int i15;
        Object obj2;
        Object obj3;
        Z5.y yVar;
        Path path;
        Object obj4;
        s2.p pVar;
        int i16;
        int i17;
        b0 b0Var5 = this;
        C1474e c1474e2 = (C1474e) b0Var5.f10989f;
        b0 b0Var6 = (b0) b0Var5.f10988e;
        C1536c c1536c2 = (C1536c) b0Var6.f10987d;
        if (abstractC0713c instanceof C1481b) {
            c1481b = (C1481b) abstractC0713c;
            int i18 = c1481b.f14455m;
            if ((i18 & Integer.MIN_VALUE) != 0) {
                c1481b.f14455m = i18 - Integer.MIN_VALUE;
                Object obj5 = c1481b.k;
                switch (c1481b.f14455m) {
                    case 0:
                        Z5.a.d(obj5);
                        it = abstractC0951a.g().iterator();
                        c1481b2 = c1481b;
                        i4 = 0;
                        abstractC0951a2 = abstractC0951a;
                        kVar2 = kVar;
                        hasNext = it.hasNext();
                        Z5.y yVar2 = Z5.y.f7506a;
                        if (hasNext) {
                            f2.a aVar = (f2.a) it.next();
                            boolean z8 = aVar instanceof f2.e;
                            EnumC0646a enumC0646a = EnumC0646a.f10656d;
                            if (z8) {
                                f2.e eVar = (f2.e) aVar;
                                c1481b2.f14451g = abstractC0951a2;
                                c1481b2.f14452h = kVar2;
                                c1481b2.f14453i = it;
                                c1481b2.j = i4;
                                c1481b2.f14455m = 1;
                                int ordinal = eVar.f10695f.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        if (abstractC0951a2 instanceof C0952b) {
                                            if (((C0952b) abstractC0951a2).f11962d == 2) {
                                                if (kVar2 != null) {
                                                    pVar = kVar2.b();
                                                    if (pVar != null) {
                                                    }
                                                }
                                                pVar = null;
                                                if (pVar != null) {
                                                }
                                            } else {
                                                C0999a c0999a = eVar.f10697h;
                                                if (c0999a != null && kVar2 != null) {
                                                    InterfaceC1661a interfaceC1661a = (InterfaceC1661a) kVar2.f14473a.get(Long.valueOf(c0999a.f12187a));
                                                    if (interfaceC1661a != null && (interfaceC1661a instanceof s2.p)) {
                                                        pVar = (s2.p) interfaceC1661a;
                                                        if (pVar != null) {
                                                            Log.w("ActionExecutor", "Click is invalid, can't execute");
                                                        } else {
                                                            path = new Path();
                                                            Point point = pVar.f14496d;
                                                            int i19 = point.x;
                                                            Point point2 = eVar.f10698i;
                                                            yVar = yVar2;
                                                            if (point2 != null) {
                                                                i16 = point2.x;
                                                            } else {
                                                                i16 = 0;
                                                            }
                                                            int i20 = i19 + i16;
                                                            int i21 = point.y;
                                                            if (point2 != null) {
                                                                i17 = point2.y;
                                                            } else {
                                                                i17 = 0;
                                                            }
                                                            AbstractC0837b.p(path, new Point(i20, i21 + i17), c1474e2);
                                                            if (path != null) {
                                                            }
                                                            obj4 = yVar;
                                                        }
                                                    }
                                                }
                                                pVar = null;
                                                if (pVar != null) {
                                                }
                                            }
                                        }
                                        yVar = yVar2;
                                        path = null;
                                        if (path != null) {
                                        }
                                        obj4 = yVar;
                                    } else {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                } else {
                                    yVar = yVar2;
                                    Point point3 = eVar.f10696g;
                                    if (point3 != null) {
                                        Path path2 = new Path();
                                        AbstractC0837b.p(path2, point3, c1474e2);
                                        path = path2;
                                        if (path != null) {
                                            GestureDescription.Builder builder = new GestureDescription.Builder();
                                            Long l6 = eVar.f10694e;
                                            o6.j.b(l6);
                                            GestureDescription c6 = AbstractC0837b.c(builder, path, l6.longValue(), c1474e2);
                                            S7.e eVar2 = L7.F.f3175a;
                                            Object A2 = AbstractC0166y.A(Q7.n.f4962a, new C1482c(b0Var5, c6, null), c1481b2);
                                            if (A2 == enumC0646a) {
                                                obj4 = A2;
                                                break;
                                            }
                                        }
                                        obj4 = yVar;
                                        break;
                                    }
                                    path = null;
                                    if (path != null) {
                                    }
                                    obj4 = yVar;
                                }
                            } else if (aVar instanceof f2.k) {
                                f2.k kVar5 = (f2.k) aVar;
                                c1481b2.f14451g = abstractC0951a2;
                                c1481b2.f14452h = kVar2;
                                c1481b2.f14453i = it;
                                c1481b2.j = i4;
                                c1481b2.f14455m = 2;
                                GestureDescription.Builder builder2 = new GestureDescription.Builder();
                                Point point4 = kVar5.f10735f;
                                Point point5 = kVar5.f10736g;
                                if (point4 != null && point5 != null) {
                                    Path path3 = new Path();
                                    AbstractC0837b.o(path3, kVar5.f10735f, point5, c1474e2);
                                    Long l8 = kVar5.f10734e;
                                    o6.j.b(l8);
                                    GestureDescription c9 = AbstractC0837b.c(builder2, path3, l8.longValue(), c1474e2);
                                    S7.e eVar3 = L7.F.f3175a;
                                    Object A8 = AbstractC0166y.A(Q7.n.f4962a, new C1487h(b0Var5, c9, null), c1481b2);
                                    if (A8 == enumC0646a) {
                                        obj3 = A8;
                                        break;
                                    }
                                }
                                obj3 = yVar2;
                                break;
                            } else if (aVar instanceof f2.i) {
                                c1481b2.f14451g = abstractC0951a2;
                                c1481b2.f14452h = kVar2;
                                c1481b2.f14453i = it;
                                c1481b2.j = i4;
                                c1481b2.f14455m = 3;
                                Long l9 = ((f2.i) aVar).f10723e;
                                o6.j.b(l9);
                                long longValue = l9.longValue();
                                if (c1474e2 != null) {
                                    longValue = c1474e2.f(longValue - 5, longValue + 6);
                                }
                                Object g8 = AbstractC0166y.g(longValue, c1481b2);
                                if (g8 == enumC0646a) {
                                    obj2 = g8;
                                    break;
                                } else {
                                    obj2 = yVar2;
                                    break;
                                }
                            } else if (aVar instanceof f2.f) {
                                c1481b2.f14451g = abstractC0951a2;
                                c1481b2.f14452h = kVar2;
                                c1481b2.f14453i = it;
                                c1481b2.j = i4;
                                c1481b2.f14455m = 4;
                                break;
                            } else {
                                if (aVar instanceof f2.o) {
                                    f2.o oVar = (f2.o) aVar;
                                    if (oVar.f10754e) {
                                        f2.n nVar = oVar.f10755f;
                                        if (nVar == null) {
                                            i15 = -1;
                                        } else {
                                            i15 = AbstractC1480a.f14450a[nVar.ordinal()];
                                        }
                                        if (i15 != -1) {
                                            if (i15 != 1) {
                                                if (i15 != 2) {
                                                    if (i15 == 3) {
                                                        R.g gVar = (R.g) c1536c2.f14808e;
                                                        Object it4 = ((C0539g) ((C0538f) gVar.f4988f).keySet()).iterator();
                                                        while (((P.C) it4).hasNext()) {
                                                            gVar.P(((Number) ((C0536d) it4).next()).longValue());
                                                        }
                                                        R.g gVar2 = (R.g) c1536c2.f14809f;
                                                        Object it5 = ((C0539g) ((C0538f) gVar2.f4988f).keySet()).iterator();
                                                        while (((P.C) it5).hasNext()) {
                                                            gVar2.P(((Number) ((C0536d) it5).next()).longValue());
                                                        }
                                                    } else {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                } else {
                                                    R.g gVar3 = (R.g) c1536c2.f14808e;
                                                    Object it6 = ((C0539g) ((C0538f) gVar3.f4988f).keySet()).iterator();
                                                    while (((P.C) it6).hasNext()) {
                                                        gVar3.q(((Number) ((C0536d) it6).next()).longValue());
                                                    }
                                                    R.g gVar4 = (R.g) c1536c2.f14809f;
                                                    Object it7 = ((C0539g) ((C0538f) gVar4.f4988f).keySet()).iterator();
                                                    while (((P.C) it7).hasNext()) {
                                                        gVar4.q(((Number) ((C0536d) it7).next()).longValue());
                                                    }
                                                }
                                            } else {
                                                R.g gVar5 = (R.g) c1536c2.f14808e;
                                                Object it8 = ((C0539g) ((C0538f) gVar5.f4988f).keySet()).iterator();
                                                while (((P.C) it8).hasNext()) {
                                                    gVar5.u(((Number) ((C0536d) it8).next()).longValue());
                                                }
                                                R.g gVar6 = (R.g) c1536c2.f14809f;
                                                Object it9 = ((C0539g) ((C0538f) gVar6.f4988f).keySet()).iterator();
                                                while (((P.C) it9).hasNext()) {
                                                    gVar6.u(((Number) ((C0536d) it9).next()).longValue());
                                                }
                                            }
                                        }
                                    } else {
                                        for (C0880a c0880a : oVar.f10756g) {
                                            f2.n nVar2 = c0880a.f11756d;
                                            C0999a c0999a2 = c0880a.f11755c;
                                            int ordinal2 = nVar2.ordinal();
                                            if (ordinal2 != 0) {
                                                if (ordinal2 != 1) {
                                                    if (ordinal2 == 2) {
                                                        o6.j.b(c0999a2);
                                                        long j = c0999a2.f12187a;
                                                        ((R.g) c1536c2.f14808e).P(j);
                                                        ((R.g) c1536c2.f14809f).P(j);
                                                    } else {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                } else {
                                                    o6.j.b(c0999a2);
                                                    long j5 = c0999a2.f12187a;
                                                    ((R.g) c1536c2.f14808e).q(j5);
                                                    ((R.g) c1536c2.f14809f).q(j5);
                                                }
                                            } else {
                                                o6.j.b(c0999a2);
                                                long j8 = c0999a2.f12187a;
                                                ((R.g) c1536c2.f14808e).u(j8);
                                                ((R.g) c1536c2.f14809f).u(j8);
                                            }
                                        }
                                    }
                                } else if (aVar instanceof f2.c) {
                                    f2.c cVar = (f2.c) aVar;
                                    Integer j9 = b0Var6.j(cVar.f10684e);
                                    if (j9 != null) {
                                        int intValue = j9.intValue();
                                        AbstractC0640c abstractC0640c = cVar.f10686g;
                                        if (abstractC0640c instanceof C0638a) {
                                            Integer j10 = b0Var6.j(((C0638a) abstractC0640c).f10597a);
                                            if (j10 != null) {
                                                i14 = j10.intValue();
                                            } else {
                                                i14 = 0;
                                            }
                                        } else if (abstractC0640c instanceof C0639b) {
                                            i14 = ((C0639b) abstractC0640c).f10598a;
                                        } else {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        String str4 = cVar.f10684e;
                                        int ordinal3 = cVar.f10685f.ordinal();
                                        if (ordinal3 != 0) {
                                            if (ordinal3 != 1) {
                                                if (ordinal3 != 2) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                            } else {
                                                i14 = intValue - i14;
                                            }
                                        } else {
                                            i14 += intValue;
                                        }
                                        o6.j.e(str4, "counterName");
                                        X6.q qVar = (X6.q) b0Var6.f10989f;
                                        qVar.getClass();
                                        LinkedHashMap linkedHashMap = qVar.f7033a;
                                        if (linkedHashMap.containsKey(str4)) {
                                            linkedHashMap.put(str4, Integer.valueOf(i14));
                                        }
                                    }
                                } else if (aVar instanceof f2.h) {
                                    f2.h hVar = (f2.h) aVar;
                                    f2.g gVar7 = hVar.f10715e;
                                    String str5 = hVar.f10717g;
                                    int ordinal4 = gVar7.ordinal();
                                    if (ordinal4 != 0) {
                                        if (ordinal4 == 1) {
                                            Integer j11 = b0Var6.j(str5);
                                            if (j11 != null) {
                                                str = str5 + " = " + j11.intValue();
                                            }
                                        } else {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    } else {
                                        str = hVar.f10716f;
                                    }
                                    String str6 = str;
                                    C1428b c1428b = (C1428b) b0Var5.f10987d;
                                    long j12 = hVar.f10711a.f12187a;
                                    String str7 = hVar.f10713c;
                                    if (str7 == null) {
                                        str7 = "Klick'r";
                                    }
                                    String str8 = str7;
                                    long j13 = abstractC0951a2.getId().f12187a;
                                    String k = abstractC0951a2.k();
                                    int i22 = hVar.f10718h;
                                    C1561b c1561b = new C1561b(j12, j13, str8, str6, k, i22);
                                    c1428b.getClass();
                                    if (c1428b.b() != null) {
                                        C1626a c1626a = c1428b.f14263b;
                                        c1626a.getClass();
                                        L1.e eVar4 = new L1.e(false);
                                        Context context = c1626a.f15295a;
                                        if (eVar4.a(context)) {
                                            if (i22 != 2) {
                                                if (i22 != 3) {
                                                    if (i22 != 4) {
                                                        c1474e = c1474e2;
                                                        str2 = null;
                                                    } else {
                                                        c1474e = c1474e2;
                                                        str2 = "KlickrScenario HIGH";
                                                    }
                                                } else {
                                                    c1474e = c1474e2;
                                                    str2 = "KlickrScenario DEFAULT";
                                                }
                                            } else {
                                                c1474e = c1474e2;
                                                str2 = "KlickrScenario LOW";
                                            }
                                            if (str2 == null) {
                                                Log.w("NotificationRequestExecutor", "Invalid channel id for importance " + i22);
                                                b0Var4 = b0Var6;
                                                c1536c = c1536c2;
                                                i12 = i4;
                                                b0Var2 = this;
                                                i4 = i12;
                                                b0Var = b0Var4;
                                                b0Var5 = b0Var2;
                                                b0Var6 = b0Var;
                                                c1474e2 = c1474e;
                                                c1536c2 = c1536c;
                                            } else {
                                                c1536c = c1536c2;
                                                C1536c c1536c3 = c1626a.f15299e;
                                                c1536c3.getClass();
                                                if (i22 == 2) {
                                                    str3 = "KlickrScenario LOW";
                                                } else if (i22 == 3) {
                                                    str3 = "KlickrScenario DEFAULT";
                                                } else if (i22 == 4) {
                                                    str3 = "KlickrScenario HIGH";
                                                } else {
                                                    str3 = null;
                                                }
                                                if (str3 == null) {
                                                    b0Var4 = b0Var6;
                                                    jVar = null;
                                                } else {
                                                    jVar = new E.j(context, str3);
                                                    jVar.f1112e = E.j.b(k);
                                                    b0Var4 = b0Var6;
                                                    if (Build.VERSION.SDK_INT >= 29) {
                                                        i11 = R.drawable.ic_notification_vector;
                                                    } else {
                                                        i11 = R.drawable.ic_action_notification;
                                                    }
                                                    jVar.f1124s.icon = i11;
                                                    jVar.j = k;
                                                    jVar.k = true;
                                                }
                                                if (jVar == null) {
                                                    i12 = i4;
                                                    c1560a = null;
                                                } else {
                                                    c1560a = (C1560a) ((LinkedHashMap) c1536c3.f14809f).get(Long.valueOf(j13));
                                                    if (c1560a == null) {
                                                        o1.a aVar2 = (o1.a) c1536c3.f14808e;
                                                        LinkedHashMap linkedHashMap2 = aVar2.f13438c;
                                                        Long valueOf = Long.valueOf(j13);
                                                        Object obj6 = linkedHashMap2.get(valueOf);
                                                        if (obj6 == null) {
                                                            i12 = i4;
                                                            int i23 = aVar2.f13439d;
                                                            aVar2.f13439d = i23 - 1;
                                                            Integer valueOf2 = Integer.valueOf(i23);
                                                            linkedHashMap2.put(valueOf, valueOf2);
                                                            obj6 = valueOf2;
                                                        } else {
                                                            i12 = i4;
                                                        }
                                                        c1560a = new C1560a(k, ((Number) obj6).intValue(), jVar);
                                                    } else {
                                                        i12 = i4;
                                                    }
                                                }
                                                if (c1560a == null) {
                                                    Log.w("NotificationRequestExecutor", "Cannot find notification group for request " + c1561b);
                                                } else {
                                                    E.j jVar2 = new E.j(context, str2);
                                                    jVar2.f1112e = E.j.b(str8);
                                                    jVar2.f1113f = E.j.b(str6);
                                                    if (Build.VERSION.SDK_INT >= 29) {
                                                        i13 = R.drawable.ic_notification_vector;
                                                    } else {
                                                        i13 = R.drawable.ic_action_notification;
                                                    }
                                                    jVar2.f1124s.icon = i13;
                                                    jVar2.f1118m = "reminder";
                                                    jVar2.j = c1560a.f15039a;
                                                    C1629d c1629d = c1626a.f15297c;
                                                    o1.a aVar3 = c1626a.f15296b;
                                                    LinkedHashMap linkedHashMap3 = aVar3.f13436a;
                                                    Long valueOf3 = Long.valueOf(j12);
                                                    Object obj7 = linkedHashMap3.get(valueOf3);
                                                    if (obj7 == null) {
                                                        int i24 = aVar3.f13437b;
                                                        aVar3.f13437b = i24 + 1;
                                                        obj7 = Integer.valueOf(i24);
                                                        linkedHashMap3.put(valueOf3, obj7);
                                                    }
                                                    int intValue2 = ((Number) obj7).intValue();
                                                    Notification a3 = jVar2.a();
                                                    o6.j.d(a3, "build(...)");
                                                    c1629d.getClass();
                                                    AbstractC0166y.q(c1629d.f15306b, null, null, new C1628c(c1629d, intValue2, a3, c1560a, null), 3);
                                                }
                                                b0Var2 = this;
                                                i4 = i12;
                                                b0Var = b0Var4;
                                                b0Var5 = b0Var2;
                                                b0Var6 = b0Var;
                                                c1474e2 = c1474e;
                                                c1536c2 = c1536c;
                                            }
                                        }
                                    }
                                } else {
                                    c1474e = c1474e2;
                                    b0Var3 = b0Var6;
                                    c1536c = c1536c2;
                                    int i25 = i4;
                                    if (aVar instanceof f2.m) {
                                        c1481b2.f14451g = abstractC0951a2;
                                        c1481b2.f14452h = kVar2;
                                        c1481b2.f14453i = it;
                                        c1481b2.j = i25;
                                        c1481b2.f14455m = 5;
                                        int ordinal5 = ((f2.m) aVar).f10745e.ordinal();
                                        if (ordinal5 != 0) {
                                            if (ordinal5 != 1) {
                                                if (ordinal5 == 2) {
                                                    i10 = 3;
                                                } else {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                            } else {
                                                i10 = 2;
                                            }
                                        } else {
                                            i10 = 1;
                                        }
                                        S7.e eVar5 = L7.F.f3175a;
                                        b0Var2 = this;
                                        Object A9 = AbstractC0166y.A(Q7.n.f4962a, new C1488i(b0Var2, i10, null), c1481b2);
                                        if (A9 == enumC0646a) {
                                            obj = A9;
                                        } else {
                                            obj = yVar2;
                                        }
                                        if (obj != enumC0646a) {
                                            abstractC0951a3 = abstractC0951a2;
                                            it2 = it;
                                            kVar3 = kVar2;
                                            c1481b = c1481b2;
                                            i8 = i25;
                                            int i26 = i8;
                                            c1481b2 = c1481b;
                                            kVar2 = kVar3;
                                            it = it2;
                                            i4 = i26;
                                            abstractC0951a2 = abstractC0951a3;
                                            b0Var = b0Var3;
                                            b0Var5 = b0Var2;
                                            b0Var6 = b0Var;
                                            c1474e2 = c1474e;
                                            c1536c2 = c1536c;
                                        }
                                    } else {
                                        b0Var2 = this;
                                        if (aVar instanceof f2.j) {
                                            f2.j jVar3 = (f2.j) aVar;
                                            c1481b2.f14451g = abstractC0951a2;
                                            c1481b2.f14452h = kVar2;
                                            c1481b2.f14453i = it;
                                            c1481b2.j = i25;
                                            c1481b2.f14455m = 6;
                                            C0538f c0538f = new C0538f();
                                            String str9 = jVar3.f10728e;
                                            ArrayList arrayList = new ArrayList();
                                            Matcher matcher = Pattern.compile("\\{([^}]+)\\}").matcher(str9);
                                            while (matcher.find()) {
                                                String group = matcher.group(1);
                                                if (group != null) {
                                                    arrayList.add(group);
                                                }
                                            }
                                            Iterator it10 = arrayList.iterator();
                                            while (it10.hasNext()) {
                                                String str10 = (String) it10.next();
                                                b0 b0Var7 = b0Var3;
                                                Integer j14 = b0Var7.j(str10);
                                                if (j14 != null) {
                                                    c0538f.put(str10, new Integer(j14.intValue()));
                                                }
                                                b0Var3 = b0Var7;
                                            }
                                            b0Var = b0Var3;
                                            C0538f c10 = c0538f.c();
                                            S7.e eVar6 = L7.F.f3175a;
                                            Object A10 = AbstractC0166y.A(Q7.n.f4962a, new C1486g(b0Var2, jVar3, c10, null), c1481b2);
                                            if (A10 != enumC0646a) {
                                                A10 = yVar2;
                                            }
                                            if (A10 != enumC0646a) {
                                                abstractC0951a4 = abstractC0951a2;
                                                it3 = it;
                                                kVar4 = kVar2;
                                                c1481b = c1481b2;
                                                i9 = i25;
                                                int i27 = i9;
                                                c1481b2 = c1481b;
                                                kVar2 = kVar4;
                                                it = it3;
                                                i4 = i27;
                                                abstractC0951a2 = abstractC0951a4;
                                                b0Var5 = b0Var2;
                                                b0Var6 = b0Var;
                                                c1474e2 = c1474e;
                                                c1536c2 = c1536c;
                                            }
                                        } else {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    }
                                    return enumC0646a;
                                }
                                c1474e = c1474e2;
                                b0Var4 = b0Var6;
                                c1536c = c1536c2;
                                i12 = i4;
                                b0Var2 = this;
                                i4 = i12;
                                b0Var = b0Var4;
                                b0Var5 = b0Var2;
                                b0Var6 = b0Var;
                                c1474e2 = c1474e;
                                c1536c2 = c1536c;
                            }
                            hasNext = it.hasNext();
                            Z5.y yVar22 = Z5.y.f7506a;
                            if (hasNext) {
                                return yVar22;
                            }
                        }
                        break;
                    case 1:
                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                        int i28 = c1481b.j;
                        Iterator it11 = c1481b.f14453i;
                        s2.k kVar6 = c1481b.f14452h;
                        AbstractC0951a abstractC0951a5 = c1481b.f14451g;
                        Z5.a.d(obj5);
                        c1481b2 = c1481b;
                        kVar2 = kVar6;
                        it = it11;
                        i4 = i28;
                        c1474e = c1474e2;
                        b0Var = b0Var6;
                        c1536c = c1536c2;
                        abstractC0951a2 = abstractC0951a5;
                        b0Var2 = b0Var5;
                        b0Var5 = b0Var2;
                        b0Var6 = b0Var;
                        c1474e2 = c1474e;
                        c1536c2 = c1536c;
                        hasNext = it.hasNext();
                        Z5.y yVar222 = Z5.y.f7506a;
                        if (hasNext) {
                        }
                        break;
                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                        i8 = c1481b.j;
                        it2 = c1481b.f14453i;
                        kVar3 = c1481b.f14452h;
                        abstractC0951a3 = c1481b.f14451g;
                        Z5.a.d(obj5);
                        c1474e = c1474e2;
                        b0Var3 = b0Var6;
                        c1536c = c1536c2;
                        b0Var2 = b0Var5;
                        int i262 = i8;
                        c1481b2 = c1481b;
                        kVar2 = kVar3;
                        it = it2;
                        i4 = i262;
                        abstractC0951a2 = abstractC0951a3;
                        b0Var = b0Var3;
                        b0Var5 = b0Var2;
                        b0Var6 = b0Var;
                        c1474e2 = c1474e;
                        c1536c2 = c1536c;
                        hasNext = it.hasNext();
                        Z5.y yVar2222 = Z5.y.f7506a;
                        if (hasNext) {
                        }
                        break;
                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                        i9 = c1481b.j;
                        it3 = c1481b.f14453i;
                        kVar4 = c1481b.f14452h;
                        abstractC0951a4 = c1481b.f14451g;
                        Z5.a.d(obj5);
                        c1474e = c1474e2;
                        b0Var = b0Var6;
                        c1536c = c1536c2;
                        b0Var2 = b0Var5;
                        int i272 = i9;
                        c1481b2 = c1481b;
                        kVar2 = kVar4;
                        it = it3;
                        i4 = i272;
                        abstractC0951a2 = abstractC0951a4;
                        b0Var5 = b0Var2;
                        b0Var6 = b0Var;
                        c1474e2 = c1474e;
                        c1536c2 = c1536c;
                        hasNext = it.hasNext();
                        Z5.y yVar22222 = Z5.y.f7506a;
                        if (hasNext) {
                        }
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        c1481b = new C1481b(b0Var5, abstractC0713c);
        Object obj52 = c1481b.k;
        switch (c1481b.f14455m) {
        }
    }

    @Override // s7.InterfaceC1514e
    public C1513d c(C0722b c0722b) {
        o6.j.e(c0722b, "classId");
        C0450k c0450k = (C0450k) ((LinkedHashMap) this.f10990g).get(c0722b);
        if (c0450k == null) {
            return null;
        }
        R3.r rVar = (R3.r) this.f10987d;
        C0542a c0542a = (C0542a) this.f10988e;
        ((C1507A) this.f10989f).m(c0722b);
        return new C1513d(rVar, c0450k, c0542a, C6.O.f726a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0111, code lost:
    
        if (L7.AbstractC0166y.A(r13, r3, r0) == r7) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x012e, code lost:
    
        if (L7.AbstractC0166y.A(r13, r5, r0) == r7) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x013b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x013c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(f2.f fVar, AbstractC0713c abstractC0713c) {
        C1483d c1483d;
        int i4;
        if (abstractC0713c instanceof C1483d) {
            c1483d = (C1483d) abstractC0713c;
            int i8 = c1483d.f14460i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c1483d.f14460i = i8 - Integer.MIN_VALUE;
                Object obj = c1483d.f14458g;
                i4 = c1483d.f14460i;
                Z5.y yVar = Z5.y.f7506a;
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 == 4) {
                                    Z5.a.d(obj);
                                    return yVar;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Z5.a.d(obj);
                            c1483d.f14460i = 4;
                            if (AbstractC0166y.g(1000L, c1483d) == enumC0646a) {
                                return enumC0646a;
                            }
                            return yVar;
                        }
                        Z5.a.d(obj);
                        return yVar;
                    }
                    Z5.a.d(obj);
                    c1483d.f14460i = 2;
                    if (AbstractC0166y.g(100L, c1483d) == enumC0646a) {
                    }
                } else {
                    Z5.a.d(obj);
                    Intent intent = new Intent();
                    String str = fVar.f10705g;
                    o6.j.b(str);
                    intent.setAction(str);
                    Integer num = fVar.f10707i;
                    o6.j.b(num);
                    intent.setFlags(num.intValue());
                    ComponentName componentName = fVar.f10706h;
                    if (componentName != null) {
                        intent.setComponent(componentName);
                    }
                    List<C0777a> list = fVar.j;
                    if (list != null) {
                        for (C0777a c0777a : list) {
                            o6.j.e(c0777a, "extra");
                            String str2 = c0777a.f11135c;
                            Object obj2 = c0777a.f11136d;
                            if (obj2 instanceof Byte) {
                                intent.putExtra(str2, ((Number) obj2).byteValue());
                            } else if (obj2 instanceof Boolean) {
                                intent.putExtra(str2, ((Boolean) obj2).booleanValue());
                            } else if (obj2 instanceof Character) {
                                intent.putExtra(str2, ((Character) obj2).charValue());
                            } else if (obj2 instanceof Double) {
                                intent.putExtra(str2, ((Number) obj2).doubleValue());
                            } else if (obj2 instanceof Integer) {
                                intent.putExtra(str2, ((Number) obj2).intValue());
                            } else if (obj2 instanceof Float) {
                                intent.putExtra(str2, ((Number) obj2).floatValue());
                            } else if (obj2 instanceof Short) {
                                intent.putExtra(str2, ((Number) obj2).shortValue());
                            } else if (obj2 instanceof String) {
                                intent.putExtra(str2, (String) obj2);
                            } else {
                                throw new IllegalArgumentException("Unsupported value type");
                            }
                        }
                    }
                    if (fVar.f10704f) {
                        S7.e eVar = L7.F.f3175a;
                        M7.e eVar2 = Q7.n.f4962a;
                        C1484e c1484e = new C1484e(this, intent, null);
                        c1483d.f14460i = 1;
                    } else {
                        S7.e eVar3 = L7.F.f3175a;
                        M7.e eVar4 = Q7.n.f4962a;
                        C1485f c1485f = new C1485f(this, intent, null);
                        c1483d.f14460i = 3;
                    }
                    return enumC0646a;
                }
            }
        }
        c1483d = new C1483d(this, abstractC0713c);
        Object obj3 = c1483d.f14458g;
        i4 = c1483d.f14460i;
        Z5.y yVar2 = Z5.y.f7506a;
        EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
        if (i4 == 0) {
        }
    }

    public AbstractComponentCallbacksC0755y e(String str) {
        a0 a0Var = (a0) ((HashMap) this.f10988e).get(str);
        if (a0Var != null) {
            return a0Var.f10972c;
        }
        return null;
    }

    public AbstractComponentCallbacksC0755y f(String str) {
        for (a0 a0Var : ((HashMap) this.f10988e).values()) {
            if (a0Var != null) {
                AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = a0Var.f10972c;
                if (!str.equals(abstractComponentCallbacksC0755y.f11114h)) {
                    abstractComponentCallbacksC0755y = abstractComponentCallbacksC0755y.f11130z.f10902c.f(str);
                }
                if (abstractComponentCallbacksC0755y != null) {
                    return abstractComponentCallbacksC0755y;
                }
            }
        }
        return null;
    }

    public C1041d g(C6.h0 h0Var) {
        ArrayList arrayList = (ArrayList) this.f10987d;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C1041d c1041d = (C1041d) arrayList.get(i4);
            if (c1041d != null && c1041d.f12327b == h0Var) {
                return c1041d;
            }
        }
        C1041d c1041d2 = new C1041d((Context) this.f10989f, h0Var);
        arrayList.add(c1041d2);
        return c1041d2;
    }

    @Override // M0.a
    public View getRoot() {
        return (LinearLayout) this.f10987d;
    }

    public ArrayList h() {
        ArrayList arrayList = new ArrayList();
        for (a0 a0Var : ((HashMap) this.f10988e).values()) {
            if (a0Var != null) {
                arrayList.add(a0Var);
            }
        }
        return arrayList;
    }

    public ArrayList i() {
        ArrayList arrayList = new ArrayList();
        for (a0 a0Var : ((HashMap) this.f10988e).values()) {
            if (a0Var != null) {
                arrayList.add(a0Var.f10972c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public Integer j(String str) {
        o6.j.e(str, "counterName");
        X6.q qVar = (X6.q) this.f10989f;
        qVar.getClass();
        return (Integer) qVar.f7033a.get(str);
    }

    public List k() {
        ArrayList arrayList;
        if (((ArrayList) this.f10987d).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f10987d)) {
            arrayList = new ArrayList((ArrayList) this.f10987d);
        }
        return arrayList;
    }

    public androidx.lifecycle.Z l(String str, InterfaceC1642c interfaceC1642c) {
        androidx.lifecycle.Z z8;
        androidx.lifecycle.Z b4;
        o6.j.e(interfaceC1642c, "modelClass");
        o6.j.e(str, "key");
        synchronized (((C1594d) this.f10990g)) {
            try {
                androidx.lifecycle.e0 e0Var = (androidx.lifecycle.e0) this.f10987d;
                e0Var.getClass();
                z8 = (androidx.lifecycle.Z) e0Var.f8840a.get(str);
                if (interfaceC1642c.b(z8)) {
                    androidx.lifecycle.b0 b0Var = (androidx.lifecycle.b0) this.f10988e;
                    if (b0Var instanceof androidx.lifecycle.X) {
                        androidx.lifecycle.X x8 = (androidx.lifecycle.X) b0Var;
                        o6.j.b(z8);
                        x8.getClass();
                        C0512x c0512x = x8.f8820d;
                        if (c0512x != null) {
                            A.i iVar = x8.f8821e;
                            o6.j.b(iVar);
                            androidx.lifecycle.U.a(z8, iVar, c0512x);
                        }
                    }
                    o6.j.c(z8, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
                } else {
                    C0949d c0949d = new C0949d((AbstractC0948c) this.f10989f);
                    c0949d.f11951a.put(androidx.lifecycle.d0.f8836b, str);
                    androidx.lifecycle.b0 b0Var2 = (androidx.lifecycle.b0) this.f10988e;
                    o6.j.e(b0Var2, "factory");
                    try {
                        try {
                            b4 = b0Var2.c(interfaceC1642c, c0949d);
                        } catch (AbstractMethodError unused) {
                            b4 = b0Var2.a(h2.a.k(interfaceC1642c), c0949d);
                        }
                    } catch (AbstractMethodError unused2) {
                        b4 = b0Var2.b(h2.a.k(interfaceC1642c));
                    }
                    z8 = b4;
                    androidx.lifecycle.e0 e0Var2 = (androidx.lifecycle.e0) this.f10987d;
                    e0Var2.getClass();
                    o6.j.e(z8, "viewModel");
                    androidx.lifecycle.Z z9 = (androidx.lifecycle.Z) e0Var2.f8840a.put(str, z8);
                    if (z9 != null) {
                        z9.b();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z8;
    }

    public boolean m(C6.S s8) {
        boolean z8;
        o6.j.e(s8, "descriptor");
        if (!o6.j.a((C6.S) this.f10988e, s8)) {
            b0 b0Var = (b0) this.f10987d;
            if (b0Var != null) {
                z8 = b0Var.m(s8);
            } else {
                z8 = false;
            }
            if (!z8) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void n(a0 a0Var) {
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = a0Var.f10972c;
        String str = abstractComponentCallbacksC0755y.f11114h;
        HashMap hashMap = (HashMap) this.f10988e;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(abstractComponentCallbacksC0755y.f11114h, a0Var);
        if (T.K(2)) {
            abstractComponentCallbacksC0755y.toString();
        }
    }

    public void o(a0 a0Var) {
        HashMap hashMap = (HashMap) this.f10988e;
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = a0Var.f10972c;
        if (abstractComponentCallbacksC0755y.f11091G) {
            ((W) this.f10990g).f(abstractComponentCallbacksC0755y);
        }
        if (hashMap.get(abstractComponentCallbacksC0755y.f11114h) == a0Var && ((a0) hashMap.put(abstractComponentCallbacksC0755y.f11114h, null)) != null && T.K(2)) {
            abstractComponentCallbacksC0755y.toString();
        }
    }

    public boolean p(C6.h0 h0Var, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f10988e).onActionItemClicked(g(h0Var), new n.t((Context) this.f10989f, (J.a) menuItem));
    }

    public boolean q(C6.h0 h0Var, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f10988e;
        C1041d g8 = g(h0Var);
        t.j jVar = (t.j) this.f10990g;
        Menu menu2 = (Menu) jVar.get(menu);
        if (menu2 == null) {
            menu2 = new MenuC1100B((Context) this.f10989f, (n.m) menu);
            jVar.put(menu, menu2);
        }
        return callback.onCreateActionMode(g8, menu2);
    }

    public Bundle r(String str, Bundle bundle) {
        HashMap hashMap = (HashMap) this.f10989f;
        if (bundle != null) {
            return (Bundle) hashMap.put(str, bundle);
        }
        return (Bundle) hashMap.remove(str);
    }

    public b0(int i4) {
        switch (i4) {
            case 1:
                ArrayList arrayList = new ArrayList();
                this.f10987d = arrayList;
                this.f10988e = arrayList;
                ArrayList arrayList2 = new ArrayList();
                this.f10989f = arrayList2;
                this.f10990g = arrayList2;
                return;
            default:
                this.f10987d = new ArrayList();
                this.f10988e = new HashMap();
                this.f10989f = new HashMap();
                return;
        }
    }

    public b0(androidx.lifecycle.e0 e0Var, androidx.lifecycle.b0 b0Var, AbstractC0948c abstractC0948c) {
        o6.j.e(e0Var, "store");
        o6.j.e(b0Var, "factory");
        o6.j.e(abstractC0948c, "defaultExtras");
        this.f10987d = e0Var;
        this.f10988e = b0Var;
        this.f10989f = abstractC0948c;
        this.f10990g = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b0(InterfaceC1163b interfaceC1163b, InterfaceC1164c interfaceC1164c, InterfaceC1162a interfaceC1162a, InterfaceC1163b interfaceC1163b2) {
        this.f10987d = interfaceC1163b;
        this.f10988e = interfaceC1164c;
        this.f10989f = interfaceC1162a;
        this.f10990g = (o6.i) interfaceC1163b2;
    }
}
