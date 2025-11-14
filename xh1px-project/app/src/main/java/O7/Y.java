package O7;

import a6.AbstractC0434i;
import a6.AbstractC0436k;
import a6.C0433h;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import d6.InterfaceC0622h;
import e6.EnumC0646a;
import f6.AbstractC0713c;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import n0.AbstractC1143u;
import n0.C1131i;
import n0.C1142t;
import n0.C1144v;
import n1.AbstractC1149a;
import n6.InterfaceC1162a;
import q0.C1352h;

/* loaded from: classes.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    public int f4113a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4114b;

    /* renamed from: c, reason: collision with root package name */
    public Object f4115c;

    /* renamed from: d, reason: collision with root package name */
    public Object f4116d;

    public Y(C1131i c1131i, int i4) {
        this.f4114b = c1131i.f12763i;
        this.f4113a = i4;
        G5.n nVar = c1131i.k;
        this.f4115c = nVar.b();
        Bundle k = q4.X.k((Z5.j[]) Arrays.copyOf(new Z5.j[0], 0));
        this.f4116d = k;
        ((A.i) nVar.j).j(k);
    }

    public void a(int i4, int i8) {
        int i9 = i8 + i4;
        char[] cArr = (char[]) this.f4116d;
        if (cArr.length <= i9) {
            int i10 = i4 * 2;
            if (i9 < i10) {
                i9 = i10;
            }
            char[] copyOf = Arrays.copyOf(cArr, i9);
            o6.j.d(copyOf, "copyOf(...)");
            this.f4116d = copyOf;
        }
    }

    public AbstractC1143u b(int i4, AbstractC1143u abstractC1143u, AbstractC1143u abstractC1143u2, boolean z8) {
        C1144v c1144v = (C1144v) this.f4114b;
        t.k kVar = (t.k) this.f4115c;
        AbstractC1143u abstractC1143u3 = (AbstractC1143u) kVar.b(i4);
        if (abstractC1143u2 != null) {
            if (o6.j.a(abstractC1143u3, abstractC1143u2) && o6.j.a(abstractC1143u3.f12814f, abstractC1143u2.f12814f)) {
                return abstractC1143u3;
            }
            abstractC1143u3 = null;
        } else if (abstractC1143u3 != null) {
            return abstractC1143u3;
        }
        if (z8) {
            Iterator it = ((H7.a) H7.m.P(new P.S(8, kVar))).iterator();
            while (true) {
                if (it.hasNext()) {
                    AbstractC1143u abstractC1143u4 = (AbstractC1143u) it.next();
                    if ((abstractC1143u4 instanceof C1144v) && !o6.j.a(abstractC1143u4, abstractC1143u)) {
                        abstractC1143u3 = ((C1144v) abstractC1143u4).j.b(i4, c1144v, abstractC1143u2, true);
                    } else {
                        abstractC1143u3 = null;
                    }
                    if (abstractC1143u3 != null) {
                        break;
                    }
                } else {
                    abstractC1143u3 = null;
                    break;
                }
            }
        }
        if (abstractC1143u3 == null) {
            C1144v c1144v2 = c1144v.f12814f;
            if (c1144v2 == null || c1144v2.equals(abstractC1143u)) {
                return null;
            }
            C1144v c1144v3 = c1144v.f12814f;
            o6.j.b(c1144v3);
            return c1144v3.j.b(i4, c1144v, abstractC1143u2, z8);
        }
        return abstractC1143u3;
    }

    public void c() {
        ((FileOutputStream) this.f4114b).write((byte[]) this.f4115c, 0, this.f4113a);
        this.f4113a = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0051, code lost:
    
        if (L7.AbstractC0166y.g(500, r0) == r4) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(MediaProjectionManager mediaProjectionManager, int i4, Intent intent, AbstractC0713c abstractC0713c) {
        a2.i iVar;
        int i8;
        Object obj;
        try {
            if (abstractC0713c instanceof a2.i) {
                iVar = (a2.i) abstractC0713c;
                int i9 = iVar.f7725l;
                if ((i9 & Integer.MIN_VALUE) != 0) {
                    iVar.f7725l = i9 - Integer.MIN_VALUE;
                    Object obj2 = iVar.j;
                    i8 = iVar.f7725l;
                    obj = EnumC0646a.f10656d;
                    if (i8 == 0) {
                        if (i8 != 1) {
                            if (i8 == 2) {
                                Z5.a.d(obj2);
                                return obj2;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i4 = iVar.f7724i;
                        intent = iVar.f7723h;
                        mediaProjectionManager = iVar.f7722g;
                        Z5.a.d(obj2);
                    } else {
                        Z5.a.d(obj2);
                        if (this.f4113a > 0) {
                            iVar.f7722g = mediaProjectionManager;
                            iVar.f7723h = intent;
                            iVar.f7724i = i4;
                            iVar.f7725l = 1;
                        }
                    }
                    return mediaProjectionManager.getMediaProjection(i4, intent);
                }
            }
            return mediaProjectionManager.getMediaProjection(i4, intent);
        } catch (SecurityException unused) {
            if (this.f4113a >= 10) {
                Log.e("MediaProjectionProxy", "Failed to get MediaProjection after " + this.f4113a + " retries");
                return null;
            }
            Log.w("MediaProjectionProxy", "Foreground service is not started yet, retrying...");
            this.f4113a++;
            iVar.f7722g = null;
            iVar.f7723h = null;
            iVar.f7724i = i4;
            iVar.f7725l = 2;
            Object d2 = d(mediaProjectionManager, i4, intent, iVar);
            if (d2 == obj) {
                return obj;
            }
            return d2;
        }
        iVar = new a2.i(this, abstractC0713c);
        Object obj22 = iVar.j;
        i8 = iVar.f7725l;
        obj = EnumC0646a.f10656d;
        if (i8 == 0) {
        }
    }

    public C1142t e(C1142t c1142t, R.g gVar, boolean z8, AbstractC1143u abstractC1143u) {
        C1142t c1142t2;
        C1144v c1144v = (C1144v) this.f4114b;
        ArrayList arrayList = new ArrayList();
        Iterator it = c1144v.iterator();
        while (true) {
            C1352h c1352h = (C1352h) it;
            c1142t2 = null;
            if (!c1352h.hasNext()) {
                break;
            }
            AbstractC1143u abstractC1143u2 = (AbstractC1143u) c1352h.next();
            if (!o6.j.a(abstractC1143u2, abstractC1143u)) {
                c1142t2 = abstractC1143u2.k(gVar);
            }
            if (c1142t2 != null) {
                arrayList.add(c1142t2);
            }
        }
        C1142t c1142t3 = (C1142t) AbstractC0436k.z0(arrayList);
        C1144v c1144v2 = c1144v.f12814f;
        if (c1144v2 != null && z8 && !c1144v2.equals(abstractC1143u)) {
            c1142t2 = c1144v2.o(gVar, c1144v);
        }
        return (C1142t) AbstractC0436k.z0(AbstractC0434i.V0(new C1142t[]{c1142t, c1142t3, c1142t2}));
    }

    public void f() {
        int i4;
        c();
        b8.d dVar = b8.d.f9257c;
        char[] cArr = (char[]) this.f4116d;
        dVar.getClass();
        o6.j.e(cArr, "array");
        synchronized (dVar) {
            int i8 = dVar.f9256b;
            int length = cArr.length + i8;
            i4 = b8.a.f9253a;
            if (length < i4) {
                dVar.f9256b = i8 + cArr.length;
                ((C0433h) dVar.f9255a).addLast(cArr);
            }
        }
        b8.b bVar = b8.b.f9254c;
        byte[] bArr = (byte[]) this.f4115c;
        bVar.getClass();
        o6.j.e(bArr, "array");
        synchronized (bVar) {
            int i9 = bVar.f9256b;
            if (bArr.length + i9 < i4) {
                bVar.f9256b = i9 + (bArr.length / 2);
                ((C0433h) bVar.f9255a).addLast(bArr);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object g(Context context, int i4, Intent intent, InterfaceC1162a interfaceC1162a, AbstractC0713c abstractC0713c) {
        a2.k kVar;
        int i8;
        Y y4;
        MediaProjection mediaProjection;
        if (abstractC0713c instanceof a2.k) {
            kVar = (a2.k) abstractC0713c;
            int i9 = kVar.j;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                kVar.j = i9 - Integer.MIN_VALUE;
                Object obj = kVar.f7728h;
                i8 = kVar.j;
                if (i8 == 0) {
                    if (i8 == 1) {
                        y4 = kVar.f7727g;
                        Z5.a.d(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Z5.a.d(obj);
                    Log.i("MediaProjectionProxy", "Get MediaProjection");
                    this.f4115c = interfaceC1162a;
                    Object systemService = context.getSystemService("media_projection");
                    o6.j.c(systemService, "null cannot be cast to non-null type android.media.projection.MediaProjectionManager");
                    kVar.f7727g = this;
                    kVar.j = 1;
                    obj = d((MediaProjectionManager) systemService, i4, intent, kVar);
                    EnumC0646a enumC0646a = EnumC0646a.f10656d;
                    if (obj == enumC0646a) {
                        return enumC0646a;
                    }
                    y4 = this;
                }
                mediaProjection = (MediaProjection) obj;
                if (mediaProjection == null) {
                    mediaProjection.registerCallback((a2.j) this.f4116d, new Handler(Looper.getMainLooper()));
                } else {
                    mediaProjection = null;
                }
                y4.f4114b = mediaProjection;
                if (((MediaProjection) this.f4114b) != null) {
                    this.f4115c = null;
                    this.f4113a = 0;
                    return Boolean.FALSE;
                }
                return Boolean.TRUE;
            }
        }
        kVar = new a2.k(this, abstractC0713c);
        Object obj2 = kVar.f7728h;
        i8 = kVar.j;
        if (i8 == 0) {
        }
        mediaProjection = (MediaProjection) obj2;
        if (mediaProjection == null) {
        }
        y4.f4114b = mediaProjection;
        if (((MediaProjection) this.f4114b) != null) {
        }
    }

    public void h(String str) {
        o6.j.e(str, "text");
        int length = str.length();
        a(0, length);
        str.getChars(0, length, (char[]) this.f4116d, 0);
        i((char[]) this.f4116d, length);
    }

    public void i(char[] cArr, int i4) {
        char c6;
        byte[] bArr = (byte[]) this.f4115c;
        if (i4 >= 0) {
            if (i4 <= cArr.length) {
                int i8 = 0;
                while (i8 < i4) {
                    char c9 = cArr[i8];
                    if (c9 < 128) {
                        if (bArr.length - this.f4113a < 1) {
                            c();
                        }
                        int i9 = this.f4113a;
                        int i10 = i9 + 1;
                        this.f4113a = i10;
                        bArr[i9] = (byte) c9;
                        i8++;
                        int min = Math.min(i4, (bArr.length - i10) + i8);
                        while (i8 < min) {
                            char c10 = cArr[i8];
                            if (c10 < 128) {
                                int i11 = this.f4113a;
                                this.f4113a = i11 + 1;
                                bArr[i11] = (byte) c10;
                                i8++;
                            }
                        }
                    } else {
                        if (c9 < 2048) {
                            if (bArr.length - this.f4113a < 2) {
                                c();
                            }
                            int i12 = this.f4113a;
                            int i13 = i12 + 1;
                            this.f4113a = i13;
                            bArr[i12] = (byte) ((c9 >> 6) | 192);
                            this.f4113a = i12 + 2;
                            bArr[i13] = (byte) ((c9 & '?') | 128);
                        } else if (c9 >= 55296 && c9 <= 57343) {
                            int i14 = i8 + 1;
                            if (i14 < i4) {
                                c6 = cArr[i14];
                            } else {
                                c6 = 0;
                            }
                            if (c9 <= 56319 && 56320 <= c6 && c6 < 57344) {
                                int i15 = (((c9 & 1023) << 10) | (c6 & 1023)) + 65536;
                                if (bArr.length - this.f4113a < 4) {
                                    c();
                                }
                                int i16 = this.f4113a;
                                int i17 = i16 + 1;
                                this.f4113a = i17;
                                bArr[i16] = (byte) ((i15 >> 18) | 240);
                                int i18 = i16 + 2;
                                this.f4113a = i18;
                                bArr[i17] = (byte) (((i15 >> 12) & 63) | 128);
                                int i19 = i16 + 3;
                                this.f4113a = i19;
                                bArr[i18] = (byte) (((i15 >> 6) & 63) | 128);
                                this.f4113a = i16 + 4;
                                bArr[i19] = (byte) ((i15 & 63) | 128);
                                i8 += 2;
                            } else {
                                if (bArr.length - this.f4113a < 1) {
                                    c();
                                }
                                int i20 = this.f4113a;
                                this.f4113a = i20 + 1;
                                bArr[i20] = (byte) 63;
                                i8 = i14;
                            }
                        } else {
                            if (bArr.length - this.f4113a < 3) {
                                c();
                            }
                            int i21 = this.f4113a;
                            int i22 = i21 + 1;
                            this.f4113a = i22;
                            bArr[i21] = (byte) ((c9 >> '\f') | 224);
                            int i23 = i21 + 2;
                            this.f4113a = i23;
                            bArr[i22] = (byte) (((c9 >> 6) & 63) | 128);
                            this.f4113a = i21 + 3;
                            bArr[i23] = (byte) ((c9 & '?') | 128);
                        }
                        i8++;
                    }
                }
                return;
            }
            StringBuilder j = AbstractC1149a.j(i4, "count > string.length: ", " > ");
            j.append(cArr.length);
            throw new IllegalArgumentException(j.toString().toString());
        }
        throw new IllegalArgumentException("count < 0");
    }

    public Y(int i4, N7.a aVar, InterfaceC0233f interfaceC0233f, InterfaceC0622h interfaceC0622h) {
        this.f4114b = interfaceC0233f;
        this.f4113a = i4;
        this.f4115c = aVar;
        this.f4116d = interfaceC0622h;
    }
}
