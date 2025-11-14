package c0;

import a.AbstractC0405a;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import t7.C1594d;

/* loaded from: classes.dex */
public final class k {
    public static final Object j = new Object();
    public static volatile k k;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f9385a;

    /* renamed from: b, reason: collision with root package name */
    public final t.f f9386b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f9387c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f9388d;

    /* renamed from: e, reason: collision with root package name */
    public final f f9389e;

    /* renamed from: f, reason: collision with root package name */
    public final j f9390f;

    /* renamed from: g, reason: collision with root package name */
    public final C1594d f9391g;

    /* renamed from: h, reason: collision with root package name */
    public final int f9392h;

    /* renamed from: i, reason: collision with root package name */
    public final d f9393i;

    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, t7.d] */
    public k(u uVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f9385a = reentrantReadWriteLock;
        this.f9387c = 3;
        j jVar = (j) uVar.f9383b;
        this.f9390f = jVar;
        int i4 = uVar.f9382a;
        this.f9392h = i4;
        this.f9393i = (d) uVar.f9384c;
        this.f9388d = new Handler(Looper.getMainLooper());
        this.f9386b = new t.f(0);
        this.f9391g = new Object();
        f fVar = new f(this);
        this.f9389e = fVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i4 == 0) {
            try {
                this.f9387c = 0;
            } catch (Throwable th) {
                this.f9385a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                jVar.a(new e(fVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static k a() {
        k kVar;
        boolean z8;
        synchronized (j) {
            try {
                kVar = k;
                if (kVar != null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (!z8) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return kVar;
    }

    public final int b() {
        this.f9385a.readLock().lock();
        try {
            return this.f9387c;
        } finally {
            this.f9385a.readLock().unlock();
        }
    }

    public final void c() {
        boolean z8;
        if (this.f9392h == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            if (b() == 1) {
                return;
            }
            this.f9385a.writeLock().lock();
            try {
                if (this.f9387c == 0) {
                    return;
                }
                this.f9387c = 0;
                this.f9385a.writeLock().unlock();
                f fVar = this.f9389e;
                k kVar = fVar.f9379a;
                try {
                    kVar.f9390f.a(new e(fVar));
                    return;
                } catch (Throwable th) {
                    kVar.d(th);
                    return;
                }
            } finally {
                this.f9385a.writeLock().unlock();
            }
        }
        throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f9385a.writeLock().lock();
        try {
            this.f9387c = 2;
            arrayList.addAll(this.f9386b);
            this.f9386b.clear();
            this.f9385a.writeLock().unlock();
            this.f9388d.post(new A5.c(arrayList, this.f9387c, th));
        } catch (Throwable th2) {
            this.f9385a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x009f A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:28:0x005a, B:31:0x005f, B:33:0x0063, B:35:0x0070, B:37:0x008f, B:39:0x0099, B:41:0x009c, B:43:0x009f, B:45:0x00af, B:46:0x00b2), top: B:27:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, c0.B] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence e(CharSequence charSequence, int i4, int i8) {
        boolean z8;
        boolean z9;
        boolean z10;
        Throwable th;
        CharSequence charSequence2;
        int i9;
        int i10;
        z[] zVarArr;
        boolean z11 = true;
        if (b() == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            if (i4 >= 0) {
                if (i8 >= 0) {
                    if (i4 <= i8) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    AbstractC0405a.i("start should be <= than end", z9);
                    C0557B c0557b = null;
                    c0557b = null;
                    if (charSequence == null) {
                        return null;
                    }
                    if (i4 <= charSequence.length()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    AbstractC0405a.i("start should be < than charSequence length", z10);
                    if (i8 > charSequence.length()) {
                        z11 = false;
                    }
                    AbstractC0405a.i("end should be < than charSequence length", z11);
                    if (charSequence.length() == 0 || i4 == i8) {
                        return charSequence;
                    }
                    R.g gVar = this.f9389e.f9380b;
                    gVar.getClass();
                    boolean z12 = charSequence instanceof x;
                    if (z12) {
                        ((x) charSequence).a();
                    }
                    try {
                        if (!z12) {
                            try {
                                if (!(charSequence instanceof Spannable)) {
                                    if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i4 - 1, i8 + 1, z.class) <= i8) {
                                        ?? obj = new Object();
                                        obj.f9373d = false;
                                        obj.f9374e = new SpannableString(charSequence);
                                        c0557b = obj;
                                    }
                                    if (c0557b != null && (zVarArr = (z[]) c0557b.f9374e.getSpans(i4, i8, z.class)) != null && zVarArr.length > 0) {
                                        for (z zVar : zVarArr) {
                                            int spanStart = c0557b.f9374e.getSpanStart(zVar);
                                            int spanEnd = c0557b.f9374e.getSpanEnd(zVar);
                                            if (spanStart != i8) {
                                                c0557b.removeSpan(zVar);
                                            }
                                            i4 = Math.min(spanStart, i4);
                                            i8 = Math.max(spanEnd, i8);
                                        }
                                    }
                                    i9 = i4;
                                    i10 = i8;
                                    if (i9 != i10 || i9 >= charSequence.length()) {
                                        charSequence2 = charSequence;
                                        if (!z12) {
                                            return charSequence2;
                                        }
                                    } else {
                                        try {
                                            charSequence2 = charSequence;
                                        } catch (Throwable th2) {
                                            charSequence2 = charSequence;
                                            th = th2;
                                            if (!z12) {
                                            }
                                        }
                                        try {
                                            C0557B c0557b2 = (C0557B) gVar.K(charSequence2, i9, i10, Integer.MAX_VALUE, false, new R3.r(c0557b, 10, (C1594d) gVar.f4987e));
                                            if (c0557b2 != null) {
                                                Spannable spannable = c0557b2.f9374e;
                                                if (z12) {
                                                    ((x) charSequence2).b();
                                                }
                                                return spannable;
                                            }
                                            if (!z12) {
                                                return charSequence2;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            th = th;
                                            if (!z12) {
                                            }
                                        }
                                    }
                                    ((x) charSequence2).b();
                                    return charSequence2;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                charSequence2 = charSequence;
                                if (!z12) {
                                    ((x) charSequence2).b();
                                    throw th;
                                }
                                throw th;
                            }
                        }
                        c0557b = new C0557B((Spannable) charSequence);
                        if (c0557b != null) {
                            while (r1 < r5) {
                            }
                        }
                        i9 = i4;
                        i10 = i8;
                        if (i9 != i10) {
                        }
                        charSequence2 = charSequence;
                        if (!z12) {
                        }
                        ((x) charSequence2).b();
                        return charSequence2;
                    } catch (Throwable th5) {
                        th = th5;
                        charSequence2 = charSequence;
                        th = th;
                        if (!z12) {
                        }
                    }
                } else {
                    throw new IllegalArgumentException("end cannot be negative");
                }
            } else {
                throw new IllegalArgumentException("start cannot be negative");
            }
        } else {
            throw new IllegalStateException("Not initialized yet");
        }
    }

    public final void f(i iVar) {
        AbstractC0405a.l(iVar, "initCallback cannot be null");
        this.f9385a.writeLock().lock();
        try {
            if (this.f9387c != 1 && this.f9387c != 2) {
                this.f9386b.add(iVar);
                this.f9385a.writeLock().unlock();
            }
            this.f9388d.post(new A5.c(Arrays.asList(iVar), this.f9387c, (Throwable) null));
            this.f9385a.writeLock().unlock();
        } catch (Throwable th) {
            this.f9385a.writeLock().unlock();
            throw th;
        }
    }
}
