const { z } = require('zod');

const noteSchema = z.object({
  title: z.string().min(1),
  content: z.string().min(1)
});

module.exports = { noteSchema };
