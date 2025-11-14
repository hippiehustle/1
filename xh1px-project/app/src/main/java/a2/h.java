package a2;

import A1.n;
import O7.Y;
import Z5.y;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.hardware.display.VirtualDisplay;
import android.media.ImageReader;
import android.media.projection.MediaProjection;
import android.util.Log;
import android.view.Surface;
import e6.EnumC0646a;
import f6.AbstractC0713c;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7717a;

    /* renamed from: b, reason: collision with root package name */
    public final Y f7718b;

    /* renamed from: c, reason: collision with root package name */
    public final A4.a f7719c;

    /* renamed from: d, reason: collision with root package name */
    public final U7.c f7720d = new U7.c();

    /* renamed from: e, reason: collision with root package name */
    public VirtualDisplay f7721e;

    public h(Context context, Y y4, A4.a aVar) {
        this.f7717a = context;
        this.f7718b = y4;
        this.f7719c = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AbstractC0713c abstractC0713c) {
        a aVar;
        int i4;
        U7.c cVar;
        try {
            if (abstractC0713c instanceof a) {
                aVar = (a) abstractC0713c;
                int i8 = aVar.j;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    aVar.j = i8 - Integer.MIN_VALUE;
                    Object obj = aVar.f7694h;
                    i4 = aVar.j;
                    if (i4 == 0) {
                        if (i4 == 1) {
                            cVar = aVar.f7693g;
                            Z5.a.d(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        Z5.a.d(obj);
                        U7.c cVar2 = this.f7720d;
                        aVar.f7693g = cVar2;
                        aVar.j = 1;
                        Object d2 = cVar2.d(aVar);
                        EnumC0646a enumC0646a = EnumC0646a.f10656d;
                        if (d2 == enumC0646a) {
                            return enumC0646a;
                        }
                        cVar = cVar2;
                    }
                    return this.f7719c.j();
                }
            }
            return this.f7719c.j();
        } finally {
            cVar.a(null);
        }
        aVar = new a(this, abstractC0713c);
        Object obj2 = aVar.f7694h;
        i4 = aVar.j;
        if (i4 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056 A[Catch: all -> 0x0094, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0094, blocks: (B:12:0x004c, B:18:0x0056), top: B:11:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Point point, AbstractC0713c abstractC0713c) {
        b bVar;
        int i4;
        U7.c cVar;
        VirtualDisplay virtualDisplay;
        A4.a aVar = this.f7719c;
        try {
            if (abstractC0713c instanceof b) {
                bVar = (b) abstractC0713c;
                int i8 = bVar.k;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    bVar.k = i8 - Integer.MIN_VALUE;
                    Object obj = bVar.f7698i;
                    i4 = bVar.k;
                    if (i4 == 0) {
                        if (i4 == 1) {
                            U7.c cVar2 = bVar.f7697h;
                            Point point2 = bVar.f7696g;
                            Z5.a.d(obj);
                            cVar = cVar2;
                            point = point2;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        Z5.a.d(obj);
                        bVar.f7696g = point;
                        cVar = this.f7720d;
                        bVar.f7697h = cVar;
                        bVar.k = 1;
                        Object d2 = cVar.d(bVar);
                        EnumC0646a enumC0646a = EnumC0646a.f10656d;
                        if (d2 == enumC0646a) {
                            return enumC0646a;
                        }
                    }
                    virtualDisplay = this.f7721e;
                    y yVar = y.f7506a;
                    if (virtualDisplay != null) {
                        return yVar;
                    }
                    Log.i("DisplayRecorder", "Resizing virtual display to " + point);
                    aVar.p(point);
                    ImageReader imageReader = (ImageReader) aVar.f281f;
                    o6.j.b(imageReader);
                    Surface surface = imageReader.getSurface();
                    o6.j.d(surface, "getSurface(...)");
                    virtualDisplay.setSurface(surface);
                    virtualDisplay.resize(point.x, point.y, this.f7717a.getResources().getConfiguration().densityDpi);
                    return yVar;
                }
            }
            virtualDisplay = this.f7721e;
            y yVar2 = y.f7506a;
            if (virtualDisplay != null) {
            }
        } finally {
            cVar.a(null);
        }
        bVar = new b(this, abstractC0713c);
        Object obj2 = bVar.f7698i;
        i4 = bVar.k;
        if (i4 == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a6 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0030, B:14:0x009e, B:16:0x00a6, B:17:0x00ae, B:25:0x0075, B:29:0x0081, B:30:0x0087), top: B:8:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0030, B:14:0x009e, B:16:0x00a6, B:17:0x00ae, B:25:0x0075, B:29:0x0081, B:30:0x0087), top: B:8:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0030, B:14:0x009e, B:16:0x00a6, B:17:0x00ae, B:25:0x0075, B:29:0x0081, B:30:0x0087), top: B:8:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0056  */
    /* JADX WARN: Type inference failed for: r0v8, types: [n6.a] */
    /* JADX WARN: Type inference failed for: r11v0, types: [int] */
    /* JADX WARN: Type inference failed for: r11v1, types: [U7.a] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v4, types: [U7.a] */
    /* JADX WARN: Type inference failed for: r13v8, types: [U7.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(int i4, Intent intent, n nVar, AbstractC0713c abstractC0713c) {
        c cVar;
        int i8;
        Intent intent2;
        n nVar2;
        int i9;
        boolean z8;
        int i10;
        U7.c cVar2;
        boolean z9;
        Y y4;
        InterfaceC1162a interfaceC1162a;
        Object obj;
        try {
            if (abstractC0713c instanceof c) {
                cVar = (c) abstractC0713c;
                int i11 = cVar.f7704n;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    cVar.f7704n = i11 - Integer.MIN_VALUE;
                    c cVar3 = cVar;
                    Object obj2 = cVar3.f7702l;
                    i8 = cVar3.f7704n;
                    EnumC0646a enumC0646a = EnumC0646a.f10656d;
                    if (i8 == 0) {
                        if (i8 != 1) {
                            if (i8 == 2) {
                                Object obj3 = cVar3.k;
                                interfaceC1162a = cVar3.j;
                                Z5.a.d(obj2);
                                obj = obj3;
                                i4 = obj;
                                if (!((Boolean) obj2).booleanValue()) {
                                    Log.e("DisplayRecorder", "Failed to start media projection");
                                    interfaceC1162a.a();
                                    i4 = obj;
                                }
                                y yVar = y.f7506a;
                                i4.a(null);
                                return yVar;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i12 = cVar3.f7700h;
                        int i13 = cVar3.f7699g;
                        ?? r13 = cVar3.k;
                        ?? r02 = cVar3.j;
                        intent2 = cVar3.f7701i;
                        Z5.a.d(obj2);
                        i9 = i12;
                        cVar2 = r13;
                        z8 = true;
                        i10 = i13;
                        nVar2 = r02;
                        z9 = false;
                    } else {
                        Z5.a.d(obj2);
                        cVar3.f7701i = intent;
                        cVar3.j = nVar;
                        U7.c cVar4 = this.f7720d;
                        cVar3.k = cVar4;
                        cVar3.f7699g = i4;
                        cVar3.f7700h = 0;
                        cVar3.f7704n = 1;
                        if (cVar4.d(cVar3) != enumC0646a) {
                            intent2 = intent;
                            nVar2 = nVar;
                            i9 = 0;
                            z8 = true;
                            i10 = i4;
                            cVar2 = cVar4;
                            z9 = false;
                        }
                        return enumC0646a;
                    }
                    y4 = this.f7718b;
                    if (((MediaProjection) y4.f4114b) != null) {
                        z8 = z9;
                    }
                    if (!z8) {
                        Log.w("DisplayRecorder", "Attempting to start media projection while already started.");
                        i4 = cVar2;
                        y yVar2 = y.f7506a;
                        i4.a(null);
                        return yVar2;
                    }
                    Context context = this.f7717a;
                    cVar3.f7701i = null;
                    cVar3.j = nVar2;
                    cVar3.k = cVar2;
                    cVar3.f7699g = i10;
                    cVar3.f7700h = i9;
                    cVar3.f7704n = 2;
                    obj2 = y4.g(context, i10, intent2, nVar2, cVar3);
                    if (obj2 != enumC0646a) {
                        interfaceC1162a = nVar2;
                        obj = cVar2;
                        i4 = obj;
                        if (!((Boolean) obj2).booleanValue()) {
                        }
                        y yVar22 = y.f7506a;
                        i4.a(null);
                        return yVar22;
                    }
                    return enumC0646a;
                }
            }
            if (i8 == 0) {
            }
            y4 = this.f7718b;
            if (((MediaProjection) y4.f4114b) != null) {
            }
            if (!z8) {
            }
        } catch (Throwable th) {
            i4.a(null);
            throw th;
        }
        cVar = new c(this, abstractC0713c);
        c cVar32 = cVar;
        Object obj22 = cVar32.f7702l;
        i8 = cVar32.f7704n;
        EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d A[Catch: all -> 0x00cb, TRY_LEAVE, TryCatch #1 {all -> 0x00cb, blocks: (B:12:0x0053, B:17:0x0061, B:20:0x0066, B:22:0x009d, B:24:0x00c5, B:29:0x00a4, B:32:0x00b6, B:34:0x00c1, B:35:0x00cd), top: B:11:0x0053, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Point point, AbstractC0713c abstractC0713c) {
        d dVar;
        int i4;
        boolean z8;
        Point point2;
        U7.c cVar;
        y yVar;
        MediaProjection mediaProjection;
        VirtualDisplay createVirtualDisplay;
        A4.a aVar = this.f7719c;
        Y y4 = this.f7718b;
        try {
            if (abstractC0713c instanceof d) {
                dVar = (d) abstractC0713c;
                int i8 = dVar.k;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    dVar.k = i8 - Integer.MIN_VALUE;
                    Object obj = dVar.f7707i;
                    i4 = dVar.k;
                    z8 = true;
                    if (i4 == 0) {
                        if (i4 == 1) {
                            cVar = dVar.f7706h;
                            Point point3 = dVar.f7705g;
                            Z5.a.d(obj);
                            point2 = point3;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        Z5.a.d(obj);
                        point2 = point;
                        dVar.f7705g = point2;
                        cVar = this.f7720d;
                        dVar.f7706h = cVar;
                        dVar.k = 1;
                        Object d2 = cVar.d(dVar);
                        EnumC0646a enumC0646a = EnumC0646a.f10656d;
                        if (d2 == enumC0646a) {
                            return enumC0646a;
                        }
                    }
                    if (((MediaProjection) y4.f4114b) == null) {
                        z8 = false;
                    }
                    yVar = y.f7506a;
                    if (z8 && this.f7721e == null) {
                        Log.i("DisplayRecorder", "Start screen record with display size " + point2);
                        aVar.p(point2);
                        int i9 = this.f7717a.getResources().getConfiguration().densityDpi;
                        ImageReader imageReader = (ImageReader) aVar.f281f;
                        o6.j.b(imageReader);
                        Surface surface = imageReader.getSurface();
                        o6.j.d(surface, "getSurface(...)");
                        mediaProjection = (MediaProjection) y4.f4114b;
                        if (mediaProjection != null) {
                            Log.e("MediaProjectionProxy", "Can't create virtual display, MediaProjection is null");
                        } else {
                            try {
                                createVirtualDisplay = mediaProjection.createVirtualDisplay("Klickr", point2.x, point2.y, i9, 16, surface, null, null);
                            } catch (SecurityException e9) {
                                Log.e("MediaProjectionProxy", "Can't create VirtualDisplay, screencast permission is no longer valid", e9);
                                InterfaceC1162a interfaceC1162a = (InterfaceC1162a) y4.f4115c;
                                if (interfaceC1162a != null) {
                                    interfaceC1162a.a();
                                }
                            }
                            this.f7721e = createVirtualDisplay;
                            return yVar;
                        }
                        createVirtualDisplay = null;
                        this.f7721e = createVirtualDisplay;
                        return yVar;
                    }
                    Log.w("DisplayRecorder", "Attempting to start screen record while already started.");
                    return yVar;
                }
            }
            if (((MediaProjection) y4.f4114b) == null) {
            }
            yVar = y.f7506a;
            if (z8) {
                Log.i("DisplayRecorder", "Start screen record with display size " + point2);
                aVar.p(point2);
                int i92 = this.f7717a.getResources().getConfiguration().densityDpi;
                ImageReader imageReader2 = (ImageReader) aVar.f281f;
                o6.j.b(imageReader2);
                Surface surface2 = imageReader2.getSurface();
                o6.j.d(surface2, "getSurface(...)");
                mediaProjection = (MediaProjection) y4.f4114b;
                if (mediaProjection != null) {
                }
                createVirtualDisplay = null;
                this.f7721e = createVirtualDisplay;
                return yVar;
            }
            Log.w("DisplayRecorder", "Attempting to start screen record while already started.");
            return yVar;
        } finally {
            cVar.a(null);
        }
        dVar = new d(this, abstractC0713c);
        Object obj2 = dVar.f7707i;
        i4 = dVar.k;
        z8 = true;
        if (i4 == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0041, code lost:
    
        if (f(r0) == r4) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062 A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:13:0x0053, B:15:0x0062, B:16:0x006c), top: B:12:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(AbstractC0713c abstractC0713c) {
        e eVar;
        int i4;
        Object obj;
        U7.c cVar;
        U7.c cVar2;
        MediaProjection mediaProjection;
        if (abstractC0713c instanceof e) {
            eVar = (e) abstractC0713c;
            int i8 = eVar.j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                eVar.j = i8 - Integer.MIN_VALUE;
                Object obj2 = eVar.f7709h;
                i4 = eVar.j;
                obj = EnumC0646a.f10656d;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            cVar2 = eVar.f7708g;
                            Z5.a.d(obj2);
                            try {
                                Y y4 = this.f7718b;
                                Log.i("MediaProjectionProxy", "Stop MediaProjection");
                                mediaProjection = (MediaProjection) y4.f4114b;
                                if (mediaProjection != null) {
                                    mediaProjection.unregisterCallback((j) y4.f4116d);
                                    mediaProjection.stop();
                                }
                                y4.f4114b = null;
                                y4.f4115c = null;
                                cVar2.a(null);
                                return y.f7506a;
                            } catch (Throwable th) {
                                cVar2.a(null);
                                throw th;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Z5.a.d(obj2);
                } else {
                    Z5.a.d(obj2);
                    eVar.j = 1;
                }
                cVar = this.f7720d;
                eVar.f7708g = cVar;
                eVar.j = 2;
                if (cVar.d(eVar) != obj) {
                    cVar2 = cVar;
                    Y y42 = this.f7718b;
                    Log.i("MediaProjectionProxy", "Stop MediaProjection");
                    mediaProjection = (MediaProjection) y42.f4114b;
                    if (mediaProjection != null) {
                    }
                    y42.f4114b = null;
                    y42.f4115c = null;
                    cVar2.a(null);
                    return y.f7506a;
                }
                return obj;
            }
        }
        eVar = new e(this, abstractC0713c);
        Object obj22 = eVar.f7709h;
        i4 = eVar.j;
        obj = EnumC0646a.f10656d;
        if (i4 == 0) {
        }
        cVar = this.f7720d;
        eVar.f7708g = cVar;
        eVar.j = 2;
        if (cVar.d(eVar) != obj) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047 A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:12:0x0043, B:14:0x0047, B:15:0x004f, B:17:0x0057, B:18:0x005a), top: B:11:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057 A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:12:0x0043, B:14:0x0047, B:15:0x004f, B:17:0x0057, B:18:0x005a), top: B:11:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(AbstractC0713c abstractC0713c) {
        f fVar;
        int i4;
        U7.c cVar;
        VirtualDisplay virtualDisplay;
        ImageReader imageReader;
        try {
            if (abstractC0713c instanceof f) {
                fVar = (f) abstractC0713c;
                int i8 = fVar.j;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    fVar.j = i8 - Integer.MIN_VALUE;
                    Object obj = fVar.f7712h;
                    i4 = fVar.j;
                    if (i4 == 0) {
                        if (i4 == 1) {
                            cVar = fVar.f7711g;
                            Z5.a.d(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        Z5.a.d(obj);
                        U7.c cVar2 = this.f7720d;
                        fVar.f7711g = cVar2;
                        fVar.j = 1;
                        Object d2 = cVar2.d(fVar);
                        EnumC0646a enumC0646a = EnumC0646a.f10656d;
                        if (d2 == enumC0646a) {
                            return enumC0646a;
                        }
                        cVar = cVar2;
                    }
                    virtualDisplay = this.f7721e;
                    if (virtualDisplay != null) {
                        virtualDisplay.release();
                        this.f7721e = null;
                    }
                    A4.a aVar = this.f7719c;
                    imageReader = (ImageReader) aVar.f281f;
                    if (imageReader != null) {
                        imageReader.close();
                    }
                    aVar.f281f = null;
                    aVar.f282g = null;
                    aVar.f283h = null;
                    y yVar = y.f7506a;
                    cVar.a(null);
                    return yVar;
                }
            }
            virtualDisplay = this.f7721e;
            if (virtualDisplay != null) {
            }
            A4.a aVar2 = this.f7719c;
            imageReader = (ImageReader) aVar2.f281f;
            if (imageReader != null) {
            }
            aVar2.f281f = null;
            aVar2.f282g = null;
            aVar2.f283h = null;
            y yVar2 = y.f7506a;
            cVar.a(null);
            return yVar2;
        } catch (Throwable th) {
            cVar.a(null);
            throw th;
        }
        fVar = new f(this, abstractC0713c);
        Object obj2 = fVar.f7712h;
        i4 = fVar.j;
        if (i4 == 0) {
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003f -> B:11:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0050 -> B:10:0x0052). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object g(k4.C0975g r5, f6.AbstractC0713c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof a2.g
            if (r0 == 0) goto L13
            r0 = r6
            a2.g r0 = (a2.g) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a2.g r0 = new a2.g
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f7716i
            int r1 = r0.k
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            o6.r r5 = r0.f7715h
            n6.c r1 = r0.f7714g
            Z5.a.d(r6)
            goto L52
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            Z5.a.d(r6)
            o6.r r6 = new o6.r
            r6.<init>()
        L39:
            A4.a r1 = r4.f7719c
            android.graphics.Bitmap r1 = r1.j()
            if (r1 == 0) goto L56
            r0.f7714g = r5
            r0.f7715h = r6
            r0.k = r2
            java.lang.Object r1 = r5.l(r1, r0)
            e6.a r3 = e6.EnumC0646a.f10656d
            if (r1 != r3) goto L50
            return r3
        L50:
            r1 = r5
            r5 = r6
        L52:
            r5.f13639d = r2
            r6 = r5
            r5 = r1
        L56:
            boolean r1 = r6.f13639d
            if (r1 == 0) goto L39
            Z5.y r5 = Z5.y.f7506a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.h.g(k4.g, f6.c):java.lang.Object");
    }
}
