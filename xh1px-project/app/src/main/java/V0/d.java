package V0;

import N0.B;
import N0.C0202j;
import N0.x;
import N0.z;
import Q0.r;
import Z0.k;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Base64;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: D, reason: collision with root package name */
    public final O0.a f6247D;

    /* renamed from: E, reason: collision with root package name */
    public final Rect f6248E;

    /* renamed from: F, reason: collision with root package name */
    public final Rect f6249F;

    /* renamed from: G, reason: collision with root package name */
    public final RectF f6250G;

    /* renamed from: H, reason: collision with root package name */
    public final z f6251H;

    /* renamed from: I, reason: collision with root package name */
    public r f6252I;

    /* renamed from: J, reason: collision with root package name */
    public r f6253J;
    public final Q0.h K;

    /* renamed from: L, reason: collision with root package name */
    public Z0.i f6254L;

    /* renamed from: M, reason: collision with root package name */
    public M.i f6255M;

    public d(x xVar, e eVar) {
        super(xVar, eVar);
        z zVar;
        this.f6247D = new O0.a(3, 0);
        this.f6248E = new Rect();
        this.f6249F = new Rect();
        this.f6250G = new RectF();
        String str = eVar.f6262g;
        C0202j c0202j = xVar.f3674d;
        if (c0202j == null) {
            zVar = null;
        } else {
            zVar = (z) ((HashMap) c0202j.c()).get(str);
        }
        this.f6251H = zVar;
        A4.d dVar = this.f6227p.f6277x;
        if (dVar != null) {
            this.K = new Q0.h(this, this, dVar);
        }
    }

    @Override // V0.b, P0.f
    public final void a(RectF rectF, Matrix matrix, boolean z8) {
        super.a(rectF, matrix, z8);
        z zVar = this.f6251H;
        if (zVar != null) {
            int i4 = zVar.f3698b;
            int i8 = zVar.f3697a;
            float c6 = k.c();
            if (this.f6226o.f3684p) {
                rectF.set(0.0f, 0.0f, i8 * c6, i4 * c6);
            } else {
                if (s() != null) {
                    rectF.set(0.0f, 0.0f, r1.getWidth() * c6, r1.getHeight() * c6);
                } else {
                    rectF.set(0.0f, 0.0f, i8 * c6, i4 * c6);
                }
            }
            this.f6225n.mapRect(rectF);
        }
    }

    @Override // V0.b, S0.f
    public final void e(R3.r rVar, Object obj) {
        super.e(rVar, obj);
        if (obj == B.f3535F) {
            this.f6252I = new r(rVar, null);
            return;
        }
        if (obj == B.f3538I) {
            this.f6253J = new r(rVar, null);
            return;
        }
        Q0.h hVar = this.K;
        if (obj == 5 && hVar != null) {
            hVar.f4730c.j(rVar);
            return;
        }
        if (obj == B.f3531B && hVar != null) {
            hVar.c(rVar);
            return;
        }
        if (obj == B.f3532C && hVar != null) {
            hVar.f4732e.j(rVar);
            return;
        }
        if (obj == B.f3533D && hVar != null) {
            hVar.f4733f.j(rVar);
        } else if (obj == B.f3534E && hVar != null) {
            hVar.f4734g.j(rVar);
        }
    }

    @Override // V0.b
    public final void k(Canvas canvas, Matrix matrix, int i4, Z0.a aVar) {
        z zVar;
        Bitmap s8 = s();
        if (s8 != null && !s8.isRecycled() && (zVar = this.f6251H) != null) {
            float c6 = k.c();
            O0.a aVar2 = this.f6247D;
            aVar2.setAlpha(i4);
            r rVar = this.f6252I;
            if (rVar != null) {
                aVar2.setColorFilter((ColorFilter) rVar.e());
            }
            Q0.h hVar = this.K;
            if (hVar != null) {
                aVar = hVar.a(matrix, i4);
            }
            int width = s8.getWidth();
            int height = s8.getHeight();
            Rect rect = this.f6248E;
            boolean z8 = false;
            rect.set(0, 0, width, height);
            boolean z9 = this.f6226o.f3684p;
            Rect rect2 = this.f6249F;
            if (z9) {
                rect2.set(0, 0, (int) (zVar.f3697a * c6), (int) (zVar.f3698b * c6));
            } else {
                rect2.set(0, 0, (int) (s8.getWidth() * c6), (int) (s8.getHeight() * c6));
            }
            if (aVar != null) {
                z8 = true;
            }
            if (z8) {
                if (this.f6254L == null) {
                    this.f6254L = new Z0.i();
                }
                if (this.f6255M == null) {
                    this.f6255M = new M.i(2, false);
                }
                M.i iVar = this.f6255M;
                iVar.f3287d = 255;
                iVar.f3288e = null;
                aVar.getClass();
                Z0.a aVar3 = new Z0.a(aVar);
                iVar.f3288e = aVar3;
                aVar3.b(i4);
                float f8 = rect2.left;
                float f9 = rect2.top;
                float f10 = rect2.right;
                float f11 = rect2.bottom;
                RectF rectF = this.f6250G;
                rectF.set(f8, f9, f10, f11);
                matrix.mapRect(rectF);
                canvas = this.f6254L.e(canvas, rectF, this.f6255M);
            }
            canvas.save();
            canvas.concat(matrix);
            canvas.drawBitmap(s8, rect, rect2, aVar2);
            if (z8) {
                this.f6254L.c();
                if (this.f6254L.f7278c == 4) {
                    return;
                }
            }
            canvas.restore();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r2 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        r1.j = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (r4 == r2) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap s() {
        Bitmap bitmap;
        Bitmap bitmap2;
        r rVar = this.f6253J;
        if (rVar != null && (bitmap2 = (Bitmap) rVar.e()) != null) {
            return bitmap2;
        }
        String str = this.f6227p.f6262g;
        x xVar = this.f6226o;
        R0.a aVar = xVar.j;
        if (aVar != null) {
            Context h8 = xVar.h();
            Context context = aVar.f4991a;
            if (h8 != null) {
                if (context instanceof Application) {
                    h8 = h8.getApplicationContext();
                }
            }
        }
        if (xVar.j == null) {
            xVar.j = new R0.a(xVar.getCallback(), xVar.k, xVar.f3674d.c());
        }
        R0.a aVar2 = xVar.j;
        if (aVar2 != null) {
            String str2 = aVar2.f4992b;
            z zVar = (z) aVar2.f4993c.get(str);
            if (zVar != null) {
                int i4 = zVar.f3698b;
                int i8 = zVar.f3697a;
                bitmap = zVar.f3702f;
                if (bitmap == null) {
                    Context context2 = aVar2.f4991a;
                    if (context2 != null) {
                        String str3 = zVar.f3700d;
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inScaled = true;
                        options.inDensity = 160;
                        if (str3.startsWith("data:") && str3.indexOf("base64,") > 0) {
                            try {
                                byte[] decode = Base64.decode(str3.substring(str3.indexOf(44) + 1), 0);
                                try {
                                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                                    if (decodeByteArray == null) {
                                        Z0.c.b("Decoded image `" + str + "` is null.");
                                    } else {
                                        bitmap = k.d(decodeByteArray, i8, i4);
                                        synchronized (R0.a.f4990d) {
                                            ((z) aVar2.f4993c.get(str)).f3702f = bitmap;
                                        }
                                    }
                                } catch (IllegalArgumentException e9) {
                                    Z0.c.c("Unable to decode image `" + str + "`.", e9);
                                }
                            } catch (IllegalArgumentException e10) {
                                Z0.c.c("data URL did not have correct base64 format.", e10);
                            }
                        } else {
                            try {
                                if (!TextUtils.isEmpty(str2)) {
                                    try {
                                        Bitmap decodeStream = BitmapFactory.decodeStream(context2.getAssets().open(str2 + str3), null, options);
                                        if (decodeStream == null) {
                                            Z0.c.b("Decoded image `" + str + "` is null.");
                                        } else {
                                            bitmap = k.d(decodeStream, i8, i4);
                                            synchronized (R0.a.f4990d) {
                                                ((z) aVar2.f4993c.get(str)).f3702f = bitmap;
                                            }
                                        }
                                    } catch (IllegalArgumentException e11) {
                                        Z0.c.c("Unable to decode image `" + str + "`.", e11);
                                    }
                                } else {
                                    throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                                }
                            } catch (IOException e12) {
                                Z0.c.c("Unable to open asset.", e12);
                            }
                        }
                    }
                }
                if (bitmap == null) {
                    return bitmap;
                }
                z zVar2 = this.f6251H;
                if (zVar2 == null) {
                    return null;
                }
                return zVar2.f3702f;
            }
        }
        bitmap = null;
        if (bitmap == null) {
        }
    }
}
