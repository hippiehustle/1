package Z0;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import x.AbstractC1769h;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: B, reason: collision with root package name */
    public static final Matrix f7274B = new Matrix();

    /* renamed from: A, reason: collision with root package name */
    public a f7275A;

    /* renamed from: a, reason: collision with root package name */
    public Canvas f7276a;

    /* renamed from: b, reason: collision with root package name */
    public M.i f7277b;

    /* renamed from: c, reason: collision with root package name */
    public int f7278c;

    /* renamed from: d, reason: collision with root package name */
    public RectF f7279d;

    /* renamed from: e, reason: collision with root package name */
    public RectF f7280e;

    /* renamed from: f, reason: collision with root package name */
    public Rect f7281f;

    /* renamed from: g, reason: collision with root package name */
    public RectF f7282g;

    /* renamed from: h, reason: collision with root package name */
    public RectF f7283h;

    /* renamed from: i, reason: collision with root package name */
    public Rect f7284i;
    public RectF j;
    public O0.a k;

    /* renamed from: l, reason: collision with root package name */
    public Bitmap f7285l;

    /* renamed from: m, reason: collision with root package name */
    public Canvas f7286m;

    /* renamed from: n, reason: collision with root package name */
    public Rect f7287n;

    /* renamed from: o, reason: collision with root package name */
    public O0.a f7288o;

    /* renamed from: p, reason: collision with root package name */
    public Matrix f7289p;

    /* renamed from: q, reason: collision with root package name */
    public float[] f7290q;

    /* renamed from: r, reason: collision with root package name */
    public Bitmap f7291r;

    /* renamed from: s, reason: collision with root package name */
    public Bitmap f7292s;

    /* renamed from: t, reason: collision with root package name */
    public Canvas f7293t;

    /* renamed from: u, reason: collision with root package name */
    public Canvas f7294u;

    /* renamed from: v, reason: collision with root package name */
    public O0.a f7295v;

    /* renamed from: w, reason: collision with root package name */
    public BlurMaskFilter f7296w;

    /* renamed from: x, reason: collision with root package name */
    public float f7297x = 0.0f;

    /* renamed from: y, reason: collision with root package name */
    public RenderNode f7298y;

    /* renamed from: z, reason: collision with root package name */
    public RenderNode f7299z;

    public static Bitmap a(RectF rectF, Bitmap.Config config) {
        return Bitmap.createBitmap(Math.max((int) Math.ceil(rectF.width() * 1.05d), 1), Math.max((int) Math.ceil(rectF.height() * 1.05d), 1), config);
    }

    public static boolean d(Bitmap bitmap, RectF rectF) {
        if (bitmap != null && rectF.width() < bitmap.getWidth() && rectF.height() < bitmap.getHeight() && rectF.width() >= bitmap.getWidth() * 0.75f && rectF.height() >= bitmap.getHeight() * 0.75f) {
            return false;
        }
        return true;
    }

    public final RectF b(RectF rectF, a aVar) {
        if (this.f7280e == null) {
            this.f7280e = new RectF();
        }
        if (this.f7282g == null) {
            this.f7282g = new RectF();
        }
        this.f7280e.set(rectF);
        this.f7280e.offsetTo(rectF.left + aVar.f7250b, rectF.top + aVar.f7251c);
        RectF rectF2 = this.f7280e;
        float f8 = aVar.f7249a;
        rectF2.inset(-f8, -f8);
        this.f7282g.set(rectF);
        this.f7280e.union(this.f7282g);
        return this.f7280e;
    }

    public final void c() {
        float f8;
        O0.a aVar;
        float f9;
        RenderEffect createColorFilterEffect;
        RecordingCanvas beginRecording;
        if (this.f7276a != null && this.f7277b != null && this.f7290q != null && this.f7279d != null) {
            int b4 = AbstractC1769h.b(this.f7278c);
            if (b4 != 0) {
                if (b4 != 1) {
                    float f10 = 1.0f;
                    if (b4 != 2) {
                        if (b4 == 3) {
                            if (this.f7298y != null) {
                                int i4 = Build.VERSION.SDK_INT;
                                if (i4 >= 29) {
                                    this.f7276a.save();
                                    Canvas canvas = this.f7276a;
                                    float[] fArr = this.f7290q;
                                    canvas.scale(1.0f / fArr[0], 1.0f / fArr[4]);
                                    this.f7298y.endRecording();
                                    if (this.f7277b.e()) {
                                        Canvas canvas2 = this.f7276a;
                                        a aVar2 = (a) this.f7277b.f3288e;
                                        if (this.f7298y != null && this.f7299z != null) {
                                            if (i4 >= 31) {
                                                float[] fArr2 = this.f7290q;
                                                if (fArr2 != null) {
                                                    f9 = fArr2[0];
                                                } else {
                                                    f9 = 1.0f;
                                                }
                                                if (fArr2 != null) {
                                                    f10 = fArr2[4];
                                                }
                                                a aVar3 = this.f7275A;
                                                if (aVar3 == null || aVar2.f7249a != aVar3.f7249a || aVar2.f7250b != aVar3.f7250b || aVar2.f7251c != aVar3.f7251c || aVar2.f7252d != aVar3.f7252d) {
                                                    createColorFilterEffect = RenderEffect.createColorFilterEffect(new PorterDuffColorFilter(aVar2.f7252d, PorterDuff.Mode.SRC_IN));
                                                    float f11 = aVar2.f7249a;
                                                    if (f11 > 0.0f) {
                                                        float f12 = ((f9 + f10) * f11) / 2.0f;
                                                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                                                        createColorFilterEffect = RenderEffect.createBlurEffect(f12, f12, createColorFilterEffect, Shader.TileMode.CLAMP);
                                                    }
                                                    this.f7299z.setRenderEffect(createColorFilterEffect);
                                                    this.f7275A = aVar2;
                                                }
                                                RectF b9 = b(this.f7279d, aVar2);
                                                RectF rectF = new RectF(b9.left * f9, b9.top * f10, b9.right * f9, b9.bottom * f10);
                                                this.f7299z.setPosition(0, 0, (int) rectF.width(), (int) rectF.height());
                                                beginRecording = this.f7299z.beginRecording((int) rectF.width(), (int) rectF.height());
                                                beginRecording.translate((aVar2.f7250b * f9) + (-rectF.left), (aVar2.f7251c * f10) + (-rectF.top));
                                                beginRecording.drawRenderNode(this.f7298y);
                                                this.f7299z.endRecording();
                                                canvas2.save();
                                                canvas2.translate(rectF.left, rectF.top);
                                                canvas2.drawRenderNode(this.f7299z);
                                                canvas2.restore();
                                            } else {
                                                throw new RuntimeException("RenderEffect is not supported on API level <31");
                                            }
                                        } else {
                                            throw new IllegalStateException("Cannot render to render node outside a start()/finish() block");
                                        }
                                    }
                                    this.f7276a.drawRenderNode(this.f7298y);
                                    this.f7276a.restore();
                                } else {
                                    throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
                                }
                            } else {
                                throw new IllegalStateException("RenderNode is not ready; should've been initialized at start() time");
                            }
                        }
                    } else if (this.f7285l != null) {
                        if (this.f7277b.e()) {
                            Canvas canvas3 = this.f7276a;
                            a aVar4 = (a) this.f7277b.f3288e;
                            RectF rectF2 = this.f7279d;
                            if (rectF2 != null && this.f7285l != null) {
                                RectF b10 = b(rectF2, aVar4);
                                if (this.f7281f == null) {
                                    this.f7281f = new Rect();
                                }
                                this.f7281f.set((int) Math.floor(b10.left), (int) Math.floor(b10.top), (int) Math.ceil(b10.right), (int) Math.ceil(b10.bottom));
                                float[] fArr3 = this.f7290q;
                                if (fArr3 != null) {
                                    f8 = fArr3[0];
                                } else {
                                    f8 = 1.0f;
                                }
                                if (fArr3 != null) {
                                    f10 = fArr3[4];
                                }
                                if (this.f7283h == null) {
                                    this.f7283h = new RectF();
                                }
                                this.f7283h.set(b10.left * f8, b10.top * f10, b10.right * f8, b10.bottom * f10);
                                if (this.f7284i == null) {
                                    this.f7284i = new Rect();
                                }
                                this.f7284i.set(0, 0, Math.round(this.f7283h.width()), Math.round(this.f7283h.height()));
                                if (d(this.f7291r, this.f7283h)) {
                                    Bitmap bitmap = this.f7291r;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                    }
                                    Bitmap bitmap2 = this.f7292s;
                                    if (bitmap2 != null) {
                                        bitmap2.recycle();
                                    }
                                    this.f7291r = a(this.f7283h, Bitmap.Config.ARGB_8888);
                                    this.f7292s = a(this.f7283h, Bitmap.Config.ALPHA_8);
                                    this.f7293t = new Canvas(this.f7291r);
                                    this.f7294u = new Canvas(this.f7292s);
                                } else {
                                    Canvas canvas4 = this.f7293t;
                                    if (canvas4 != null && this.f7294u != null && (aVar = this.f7288o) != null) {
                                        canvas4.drawRect(this.f7284i, aVar);
                                        this.f7294u.drawRect(this.f7284i, this.f7288o);
                                    } else {
                                        throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas and bitmap ready");
                                    }
                                }
                                if (this.f7292s != null) {
                                    if (this.f7295v == null) {
                                        this.f7295v = new O0.a(1, 0);
                                    }
                                    RectF rectF3 = this.f7279d;
                                    this.f7294u.drawBitmap(this.f7285l, Math.round((rectF3.left - b10.left) * f8), Math.round((rectF3.top - b10.top) * f10), (Paint) null);
                                    if (this.f7296w == null || this.f7297x != aVar4.f7249a) {
                                        float f13 = ((f8 + f10) * aVar4.f7249a) / 2.0f;
                                        if (f13 > 0.0f) {
                                            this.f7296w = new BlurMaskFilter(f13, BlurMaskFilter.Blur.NORMAL);
                                        } else {
                                            this.f7296w = null;
                                        }
                                        this.f7297x = aVar4.f7249a;
                                    }
                                    this.f7295v.setColor(aVar4.f7252d);
                                    if (aVar4.f7249a > 0.0f) {
                                        this.f7295v.setMaskFilter(this.f7296w);
                                    } else {
                                        this.f7295v.setMaskFilter(null);
                                    }
                                    this.f7295v.setFilterBitmap(true);
                                    this.f7293t.drawBitmap(this.f7292s, Math.round(aVar4.f7250b * f8), Math.round(aVar4.f7251c * f10), this.f7295v);
                                    canvas3.drawBitmap(this.f7291r, this.f7284i, this.f7281f, this.k);
                                } else {
                                    throw new IllegalStateException("Expected to have allocated a shadow mask bitmap");
                                }
                            } else {
                                throw new IllegalStateException("Cannot render to bitmap outside a start()/finish() block");
                            }
                        }
                        if (this.f7287n == null) {
                            this.f7287n = new Rect();
                        }
                        this.f7287n.set(0, 0, (int) (this.f7279d.width() * this.f7290q[0]), (int) (this.f7279d.height() * this.f7290q[4]));
                        this.f7276a.drawBitmap(this.f7285l, this.f7287n, this.f7279d, this.k);
                    } else {
                        throw new IllegalStateException("Bitmap is not ready; should've been initialized at start() time");
                    }
                } else {
                    this.f7276a.restore();
                }
            } else {
                this.f7276a.restore();
            }
            this.f7276a = null;
            return;
        }
        throw new IllegalStateException("OffscreenBitmap: finish() call without matching start()");
    }

    public final Canvas e(Canvas canvas, RectF rectF, M.i iVar) {
        RecordingCanvas beginRecording;
        if (this.f7276a == null) {
            if (this.f7290q == null) {
                this.f7290q = new float[9];
            }
            if (this.f7289p == null) {
                this.f7289p = new Matrix();
            }
            canvas.getMatrix(this.f7289p);
            this.f7289p.getValues(this.f7290q);
            float[] fArr = this.f7290q;
            float f8 = fArr[0];
            int i4 = 4;
            float f9 = fArr[4];
            if (this.j == null) {
                this.j = new RectF();
            }
            this.j.set(rectF.left * f8, rectF.top * f9, rectF.right * f8, rectF.bottom * f9);
            this.f7276a = canvas;
            this.f7277b = iVar;
            if (iVar.f3287d >= 255 && !iVar.e()) {
                i4 = 1;
            } else if (!iVar.e()) {
                i4 = 2;
            } else {
                int i8 = Build.VERSION.SDK_INT;
                if (i8 < 29 || !canvas.isHardwareAccelerated() || i8 <= 31) {
                    i4 = 3;
                }
            }
            this.f7278c = i4;
            if (this.f7279d == null) {
                this.f7279d = new RectF();
            }
            this.f7279d.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            if (this.k == null) {
                this.k = new O0.a();
            }
            this.k.reset();
            int b4 = AbstractC1769h.b(this.f7278c);
            if (b4 != 0) {
                if (b4 != 1) {
                    Matrix matrix = f7274B;
                    if (b4 != 2) {
                        if (b4 == 3) {
                            if (Build.VERSION.SDK_INT >= 29) {
                                if (this.f7298y == null) {
                                    this.f7298y = C.a.c();
                                }
                                if (iVar.e() && this.f7299z == null) {
                                    this.f7299z = C.a.t();
                                    this.f7275A = null;
                                }
                                this.f7298y.setAlpha(iVar.f3287d / 255.0f);
                                if (iVar.e()) {
                                    RenderNode renderNode = this.f7299z;
                                    if (renderNode != null) {
                                        renderNode.setAlpha(iVar.f3287d / 255.0f);
                                    } else {
                                        throw new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
                                    }
                                }
                                this.f7298y.setHasOverlappingRendering(true);
                                RenderNode renderNode2 = this.f7298y;
                                RectF rectF2 = this.j;
                                renderNode2.setPosition((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                                beginRecording = this.f7298y.beginRecording((int) this.j.width(), (int) this.j.height());
                                beginRecording.setMatrix(matrix);
                                beginRecording.scale(f8, f9);
                                beginRecording.translate(-rectF.left, -rectF.top);
                                return beginRecording;
                            }
                            throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
                        }
                        throw new RuntimeException("Invalid render strategy for OffscreenLayer");
                    }
                    if (this.f7288o == null) {
                        O0.a aVar = new O0.a();
                        this.f7288o = aVar;
                        aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    }
                    if (d(this.f7285l, this.j)) {
                        Bitmap bitmap = this.f7285l;
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        this.f7285l = a(this.j, Bitmap.Config.ARGB_8888);
                        this.f7286m = new Canvas(this.f7285l);
                    } else {
                        Canvas canvas2 = this.f7286m;
                        if (canvas2 != null) {
                            canvas2.setMatrix(matrix);
                            this.f7286m.drawRect(-1.0f, -1.0f, this.j.width() + 1.0f, this.j.height() + 1.0f, this.f7288o);
                        } else {
                            throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas ready");
                        }
                    }
                    H.d.a(0, this.k);
                    this.k.setColorFilter(null);
                    this.k.setAlpha(iVar.f3287d);
                    Canvas canvas3 = this.f7286m;
                    canvas3.scale(f8, f9);
                    canvas3.translate(-rectF.left, -rectF.top);
                    return canvas3;
                }
                this.k.setAlpha(iVar.f3287d);
                this.k.setColorFilter(null);
                O0.a aVar2 = this.k;
                Matrix matrix2 = k.f7301a;
                canvas.saveLayer(rectF, aVar2);
                return canvas;
            }
            canvas.save();
            return canvas;
        }
        throw new IllegalStateException("Cannot nest start() calls on a single OffscreenBitmap - call finish() first");
    }
}
