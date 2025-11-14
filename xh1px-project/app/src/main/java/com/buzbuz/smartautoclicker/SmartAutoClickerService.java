package com.buzbuz.smartautoclicker;

import A3.a;
import D1.c;
import E.t;
import J3.s;
import L7.AbstractC0166y;
import P1.o;
import P1.w;
import T4.k;
import T4.l;
import V5.i;
import X5.b;
import Y1.d;
import Z.g;
import a6.C0433h;
import android.accessibilityservice.AccessibilityService;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityEvent;
import b1.InterfaceC0524c;
import c1.C0565f;
import i1.C0879a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import o6.j;
import q1.C1353a;
import q1.e;
import q2.C1365k;
import r1.C1428b;
import s1.C1479b;
import s3.AbstractC1492c;
import u1.C1626a;
import v2.h;
import x2.f;
import x3.C1787d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/buzbuz/smartautoclicker/SmartAutoClickerService;", "Landroid/accessibilityservice/AccessibilityService;", "<init>", "()V", "smartautoclicker_fDroidRelease"}, k = 1, mv = {g.FLOAT_FIELD_NUMBER, g.FLOAT_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SmartAutoClickerService extends AccessibilityService implements b {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f9743v = 0;

    /* renamed from: d, reason: collision with root package name */
    public volatile i f9744d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f9745e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public boolean f9746f = false;

    /* renamed from: g, reason: collision with root package name */
    public final l f9747g = l.f5787a;

    /* renamed from: h, reason: collision with root package name */
    public C1.g f9748h;

    /* renamed from: i, reason: collision with root package name */
    public d f9749i;
    public h j;
    public C1365k k;

    /* renamed from: l, reason: collision with root package name */
    public e f9750l;

    /* renamed from: m, reason: collision with root package name */
    public w f9751m;

    /* renamed from: n, reason: collision with root package name */
    public o f9752n;

    /* renamed from: o, reason: collision with root package name */
    public f f9753o;

    /* renamed from: p, reason: collision with root package name */
    public a f9754p;

    /* renamed from: q, reason: collision with root package name */
    public C1787d f9755q;

    /* renamed from: r, reason: collision with root package name */
    public C4.f f9756r;

    /* renamed from: s, reason: collision with root package name */
    public B3.a f9757s;

    /* renamed from: t, reason: collision with root package name */
    public C0879a f9758t;

    /* renamed from: u, reason: collision with root package name */
    public C1428b f9759u;

    @Override // X5.b
    public final Object a() {
        if (this.f9744d == null) {
            synchronized (this.f9745e) {
                try {
                    if (this.f9744d == null) {
                        this.f9744d = new i(this);
                    }
                } finally {
                }
            }
        }
        return this.f9744d.a();
    }

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        boolean z8;
        String str;
        boolean z9;
        if (printWriter == null) {
            return;
        }
        printWriter.append("* SmartAutoClickerService:").println();
        PrintWriter append = printWriter.append("  ").append("- isStarted=");
        this.f9747g.getClass();
        k kVar = l.f5788b;
        if (kVar == null) {
            kVar = null;
        }
        if (kVar != null) {
            z8 = kVar.f5786o.f5790a;
        } else {
            z8 = false;
        }
        append.append((CharSequence) (z8 + "; ")).println();
        d dVar = this.f9749i;
        if (dVar != null) {
            dVar.getClass();
            String b4 = AbstractC1492c.b("");
            printWriter.append("").println("* DisplayMetrics:");
            Y1.b bVar = dVar.f7104e;
            j.e(b4, "prefix");
            j.e(bVar, "displayConfig");
            printWriter.append((CharSequence) b4).append("DisplayConfig:");
            String str2 = ((Object) b4) + " - ";
            printWriter.append((CharSequence) str2).append("Size (Px): ").append((CharSequence) bVar.f7094a.toString()).println();
            PrintWriter append2 = printWriter.append((CharSequence) str2).append("Orientation: ");
            int i4 = bVar.f7095b;
            String str3 = "UNDEFINED";
            if (i4 == 1) {
                str = "PORTRAIT";
            } else if (i4 != 2) {
                str = "UNDEFINED";
            } else {
                str = "LANDSCAPE";
            }
            append2.append((CharSequence) str).println();
            printWriter.append((CharSequence) str2).append("Safe inset top (Px): ").append((CharSequence) String.valueOf(bVar.f7096c)).println();
            for (Map.Entry entry : bVar.f7097d.entrySet()) {
                Y1.a aVar = (Y1.a) entry.getKey();
                Y1.e eVar = (Y1.e) entry.getValue();
                if (eVar != null) {
                    PrintWriter append3 = printWriter.append((CharSequence) str2);
                    j.d(append3, "append(...)");
                    PrintWriter append4 = append3.append("Display corner ").append((CharSequence) aVar.name()).append(": [center (Px): ").append((CharSequence) eVar.f7105a.toString()).append(", radius (Px): ").append((CharSequence) String.valueOf(eVar.f7106b)).append("]");
                    j.d(append4, "append(...)");
                    append4.println();
                }
            }
            Display display = dVar.f7101b;
            j.d(display, "display");
            printWriter.append((CharSequence) b4).append("Android Display:");
            String str4 = ((Object) b4) + " - ";
            printWriter.append((CharSequence) str4).append((CharSequence) ("Display: " + display.getName() + "#" + display.getDisplayId())).println();
            PrintWriter append5 = printWriter.append((CharSequence) str4);
            int rotation = display.getRotation();
            if (rotation == 0) {
                str3 = "ROTATION_0";
            } else if (rotation == 2) {
                str3 = "ROTATION_180";
            } else if (rotation == 1) {
                str3 = "ROTATION_90";
            } else if (rotation == 3) {
                str3 = "ROTATION_270";
            }
            append5.append((CharSequence) "Rotation: ".concat(str3)).println();
            printWriter.append((CharSequence) b4).append((CharSequence) ("DisplaySize: " + dVar.d())).println();
            e eVar2 = this.f9750l;
            if (eVar2 != null) {
                eVar2.getClass();
                String b9 = AbstractC1492c.b("");
                printWriter.append("").println("* BitmapManager:");
                PrintWriter append6 = printWriter.append((CharSequence) b9);
                C1353a c1353a = eVar2.f13923a;
                append6.append((CharSequence) ("- cacheSize=[" + c1353a.size() + "/" + c1353a.maxSize() + "]; ")).append((CharSequence) ("hit/miss=[" + c1353a.hitCount() + "/" + c1353a.missCount() + "]; ")).println();
                C1.g gVar = this.f9748h;
                if (gVar != null) {
                    gVar.getClass();
                    String b10 = AbstractC1492c.b("");
                    String b11 = AbstractC1492c.b(b10);
                    printWriter.append("").println("* OverlayManager:");
                    D1.d dVar2 = gVar.f576e;
                    dVar2.getClass();
                    String b12 = AbstractC1492c.b(b10);
                    printWriter.append((CharSequence) b10).append("- Navigation Request Stack:");
                    C0433h c0433h = (C0433h) dVar2.f291e;
                    if (c0433h.isEmpty()) {
                        printWriter.append(" empty").println();
                    } else {
                        printWriter.println();
                        Iterator it = c0433h.iterator();
                        while (it.hasNext()) {
                            printWriter.append((CharSequence) b12).println((c) it.next());
                        }
                    }
                    printWriter.append((CharSequence) b10).println("- BackStack:");
                    Iterator it2 = ((C0433h) gVar.f575d.f291e).iterator();
                    while (it2.hasNext()) {
                        w1.e eVar3 = (w1.e) it2.next();
                        j.c(eVar3, "null cannot be cast to non-null type com.buzbuz.smartautoclicker.core.common.overlays.base.BaseOverlay");
                        eVar3.j(printWriter, b11);
                    }
                    h hVar = this.j;
                    if (hVar != null) {
                        hVar.getClass();
                        String b13 = AbstractC1492c.b("");
                        printWriter.append("").println("* DetectionRepository:");
                        PrintWriter append7 = printWriter.append((CharSequence) b13).append((CharSequence) ("- scenarioId=" + hVar.f15509i.f() + "; "));
                        Boolean bool = (Boolean) AbstractC1492c.j(hVar.k);
                        if (bool != null) {
                            z9 = bool.booleanValue();
                        } else {
                            z9 = false;
                        }
                        PrintWriter append8 = append7.append((CharSequence) ("canStartDetection=" + z9 + "; "));
                        v2.i iVar = (v2.i) AbstractC1492c.j(hVar.j);
                        if (iVar == null) {
                            iVar = v2.i.f15510d;
                        }
                        append8.append((CharSequence) ("detectionState=" + iVar + "; ")).println();
                        C1365k c1365k = this.k;
                        if (c1365k != null) {
                            c1365k.getClass();
                            String b14 = AbstractC1492c.b("");
                            printWriter.append("").println("* DumbEngine:");
                            printWriter.append((CharSequence) b14).append((CharSequence) ("- scenarioId=" + c1365k.f13969h.f() + "; ")).append((CharSequence) ("isRunning=" + c1365k.k.f() + "; ")).println();
                            C1428b c1428b = this.f9759u;
                            if (c1428b != null) {
                                C1479b c1479b = c1428b.f14262a;
                                c1479b.getClass();
                                String str5 = ((Object) AbstractC1492c.b("")) + "- ";
                                printWriter.append("").println("* GestureExecutor:");
                                printWriter.append((CharSequence) str5).append((CharSequence) ("Completed=" + c1479b.f14447c)).println();
                                printWriter.append((CharSequence) str5).append((CharSequence) ("Cancelled=" + c1479b.f14448d)).println();
                                printWriter.append((CharSequence) str5).append((CharSequence) ("Error=" + c1479b.f14449e)).println();
                                w wVar = this.f9751m;
                                if (wVar != null) {
                                    wVar.getClass();
                                    String b15 = AbstractC1492c.b("");
                                    printWriter.append("").println("* QualityManager:");
                                    printWriter.append((CharSequence) b15).append((CharSequence) ("- currentQualityMetrics=" + AbstractC1492c.j(wVar.f4489a.f4473c) + "; ")).append((CharSequence) ("startingQuality=" + AbstractC1492c.j(wVar.f4493e) + "; ")).append((CharSequence) ("quality=" + wVar.f4494f.f() + "; ")).println();
                                    a aVar2 = this.f9754p;
                                    if (aVar2 != null) {
                                        aVar2.getClass();
                                        String b16 = AbstractC1492c.b("");
                                        printWriter.append("").println("* RevenueRepository:");
                                        printWriter.append((CharSequence) b16).append((CharSequence) ("- userBillingState=" + AbstractC1492c.j(aVar2.f277c) + "; ")).append((CharSequence) ("isPrivacySettingRequired=" + AbstractC1492c.j(aVar2.f276b) + "; ")).println();
                                        B3.a aVar3 = this.f9757s;
                                        if (aVar3 != null) {
                                            aVar3.getClass();
                                            String b17 = AbstractC1492c.b("");
                                            printWriter.append("").println("* ReviewRepository:");
                                            printWriter.append((CharSequence) b17).append("- isUserCandidateForReview=false; ").println();
                                            return;
                                        }
                                        j.i("reviewRepository");
                                        throw null;
                                    }
                                    j.i("revenueRepository");
                                    throw null;
                                }
                                j.i("qualityRepository");
                                throw null;
                            }
                            j.i("actionExecutor");
                            throw null;
                        }
                        j.i("dumbEngine");
                        throw null;
                    }
                    j.i("detectionRepository");
                    throw null;
                }
                j.i("overlayManager");
                throw null;
            }
            j.i("bitmapManager");
            throw null;
        }
        j.i("displayConfigManager");
        throw null;
    }

    @Override // android.accessibilityservice.AccessibilityService
    public final void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
    }

    @Override // android.app.Service
    public final void onCreate() {
        if (!this.f9746f) {
            this.f9746f = true;
            c1.h hVar = ((C0565f) ((InterfaceC0524c) a())).f9444a;
            this.f9748h = (C1.g) hVar.f9473f.get();
            this.f9749i = (d) hVar.f9471d.get();
            this.j = (h) hVar.f9452F.get();
            this.k = (C1365k) hVar.f9490y.get();
            this.f9750l = (e) hVar.f9475h.get();
            this.f9751m = (w) hVar.f9465T.get();
            this.f9752n = (o) hVar.f9464S.get();
            this.f9753o = (f) hVar.f9489x.get();
            this.f9754p = (a) hVar.f9457L.get();
            this.f9755q = (C1787d) hVar.f9461P.get();
            this.f9756r = (C4.f) hVar.f9458M.get();
            this.f9757s = (B3.a) hVar.f9467V.get();
            this.f9758t = (C0879a) hVar.f9450D.get();
            this.f9759u = (C1428b) hVar.f9486u.get();
        }
        super.onCreate();
    }

    @Override // android.accessibilityservice.AccessibilityService
    public final void onInterrupt() {
    }

    @Override // android.accessibilityservice.AccessibilityService
    public final boolean onKeyEvent(KeyEvent keyEvent) {
        w1.e eVar;
        this.f9747g.getClass();
        k kVar = l.f5788b;
        if (kVar == null) {
            kVar = null;
        }
        if (kVar != null) {
            if (keyEvent != null) {
                C1.g gVar = kVar.f5775b;
                keyEvent.toString();
                if (gVar.f579h == null && (eVar = (w1.e) gVar.f575d.h()) != null) {
                    return eVar.r(keyEvent);
                }
            }
            return false;
        }
        return super.onKeyEvent(keyEvent);
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [o6.i, b1.b] */
    @Override // android.accessibilityservice.AccessibilityService
    public final void onServiceConnected() {
        super.onServiceConnected();
        o oVar = this.f9752n;
        if (oVar != null) {
            AbstractC0166y.q(oVar.f4472b, null, null, new P1.h(oVar, null), 3);
            C1428b c1428b = this.f9759u;
            if (c1428b != null) {
                c1428b.f14265d = new WeakReference(this);
                C1626a c1626a = c1428b.f14263b;
                c1626a.getClass();
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 26) {
                    t tVar = c1626a.f15298d;
                    j.e(tVar, "<this>");
                    A5.a.g();
                    NotificationChannelGroup d2 = A5.a.d(getString(R.string.notification_scenario_channel_group_name));
                    if (i4 >= 26) {
                        E.l.c(tVar.f1148b, d2);
                    }
                    A5.a.u();
                    NotificationChannel t8 = A5.a.t(getString(R.string.notification_scenario_channel_low_name));
                    t8.setGroup("Klickr User Scenarios");
                    tVar.a(t8);
                    A5.a.u();
                    NotificationChannel w8 = A5.a.w(getString(R.string.notification_scenario_channel_default_name));
                    w8.setGroup("Klickr User Scenarios");
                    tVar.a(w8);
                    A5.a.u();
                    NotificationChannel v8 = A5.a.v(getString(R.string.notification_scenario_channel_high_name));
                    v8.setGroup("Klickr User Scenarios");
                    tVar.a(v8);
                }
                C1787d c1787d = this.f9755q;
                if (c1787d != null) {
                    c1787d.f16126g = new W5.a(9, this);
                    C1.g gVar = this.f9748h;
                    if (gVar != null) {
                        C0879a c0879a = this.f9758t;
                        if (c0879a != null) {
                            h hVar = this.j;
                            if (hVar != null) {
                                C1365k c1365k = this.k;
                                if (c1365k != null) {
                                    C4.f fVar = this.f9756r;
                                    if (fVar != null) {
                                        a aVar = this.f9754p;
                                        if (aVar != null) {
                                            f fVar2 = this.f9753o;
                                            if (fVar2 != null) {
                                                k kVar = new k(this, gVar, c0879a, fVar2, hVar, c1365k, aVar, fVar, new o6.i(3, this, SmartAutoClickerService.class, "onLocalServiceStarted", "onLocalServiceStarted(JZLandroid/app/Notification;)V", 0, 0), new s(0, this, SmartAutoClickerService.class, "onLocalServiceStopped", "onLocalServiceStopped()V", 0, 0, 4));
                                                this.f9747g.getClass();
                                                l.f5788b = kVar;
                                                A1.h hVar2 = l.f5789c;
                                                if (hVar2 != null) {
                                                    hVar2.m(kVar);
                                                    return;
                                                }
                                                return;
                                            }
                                            j.i("settingsRepository");
                                            throw null;
                                        }
                                        j.i("revenueRepository");
                                        throw null;
                                    }
                                    j.i("debugRepository");
                                    throw null;
                                }
                                j.i("dumbEngine");
                                throw null;
                            }
                            j.i("detectionRepository");
                            throw null;
                        }
                        j.i("appComponentsProvider");
                        throw null;
                    }
                    j.i("overlayManager");
                    throw null;
                }
                j.i("tileRepository");
                throw null;
            }
            j.i("actionExecutor");
            throw null;
        }
        j.i("qualityMetricsMonitor");
        throw null;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        this.f9747g.getClass();
        k kVar = l.f5788b;
        if (kVar != null) {
            kVar.c();
            AbstractC0166y.e(kVar.k);
        }
        l.f5788b = null;
        A1.h hVar = l.f5789c;
        if (hVar != null) {
            hVar.m(null);
        }
        if (this.f9752n != null) {
            Log.w("QualityMonitor", "Accessibility service is unbound. If you haven't touched the accessibility permission, this means your Android device manufacturer does not comply with Android standards and have decided to killSmart AutoClicker.");
            C1428b c1428b = this.f9759u;
            if (c1428b != null) {
                c1428b.c();
                c1428b.f14265d = null;
                return super.onUnbind(intent);
            }
            j.i("actionExecutor");
            throw null;
        }
        j.i("qualityMetricsMonitor");
        throw null;
    }
}
